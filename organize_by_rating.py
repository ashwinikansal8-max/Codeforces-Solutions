"""
Organizes Codeforces solution files into folders by problem rating,
using metadata already saved by the CPH (Competitive Programming Helper)
VS Code extension in the .cph/ folder.

USAGE:
    1. Place this script in the root of your codeforces-solutions repo
       (same level as the .cph/ folder).
    2. Run:  python organize_by_rating.py
    3. It will create folders like 800/, 900/, 1000/, "unrated/" and move
       each solved file into the correct one.

Safe to re-run: files already in a rating folder are skipped.
"""

import json
import os
import re
import shutil
import time
import urllib.request

CPH_DIR = ".cph"
RATING_CACHE_FILE = ".rating_cache.json"


def load_rating_cache():
    if os.path.exists(RATING_CACHE_FILE):
        with open(RATING_CACHE_FILE, "r") as f:
            return json.load(f)
    return {}


def save_rating_cache(cache):
    with open(RATING_CACHE_FILE, "w") as f:
        json.dump(cache, f, indent=2)


def fetch_all_problem_ratings():
    """One API call gets ratings for EVERY Codeforces problem ever."""
    print("Fetching problem ratings from Codeforces API...")
    url = "https://codeforces.com/api/problemset.problems"
    with urllib.request.urlopen(url) as response:
        data = json.load(response)

    ratings = {}
    for problem in data["result"]["problems"]:
        key = f"{problem['contestId']}{problem['index']}"
        ratings[key] = problem.get("rating")  # None if unrated
    return ratings


def extract_contest_and_index(prob_json):
    """
    CPH .prob files store a 'url' field like:
    https://codeforces.com/problemset/problem/4/A
    or https://codeforces.com/contest/1748/problem/A
    """
    url = prob_json.get("url", "")
    match = re.search(r"(?:problemset/problem|contest)/(\d+)/(?:problem/)?([A-Za-z]\d?)", url)
    if not match:
        return None
    contest_id, index = match.groups()
    return f"{contest_id}{index}"


def main():
    if not os.path.isdir(CPH_DIR):
        print(f"No '{CPH_DIR}' folder found here. Run this from your repo root.")
        return

    ratings = fetch_all_problem_ratings()
    cache = load_rating_cache()
    moved, skipped, unmatched = 0, 0, 0

    for fname in os.listdir(CPH_DIR):
        if not fname.endswith(".prob"):
            continue

        prob_path = os.path.join(CPH_DIR, fname)
        with open(prob_path, "r", encoding="utf-8") as f:
            try:
                prob_json = json.load(f)
            except json.JSONDecodeError:
                continue

        # .prob filename pattern: ".<SourceFileName>_<hash>.prob"
        src_match = re.match(r"^\.(.+)_[a-f0-9]{32}\.prob$", fname)
        if not src_match:
            unmatched += 1
            continue
        source_filename = src_match.group(1)  # e.g. "AHalloumiBoxes.java"

        if not os.path.exists(source_filename):
            continue  # already moved, or renamed

        key = extract_contest_and_index(prob_json)
        if key is None:
            unmatched += 1
            continue

        if key in cache:
            rating = cache[key]
        else:
            rating = ratings.get(key)
            cache[key] = rating

        folder = str(rating) if rating else "unrated"
        os.makedirs(folder, exist_ok=True)

        dest = os.path.join(folder, source_filename)
        if os.path.exists(dest):
            skipped += 1
            continue

        shutil.move(source_filename, dest)
        print(f"  {source_filename}  ->  {folder}/")
        moved += 1

    save_rating_cache(cache)
    print(f"\nDone. Moved: {moved}, Skipped (already placed): {skipped}, Unmatched: {unmatched}")


if __name__ == "__main__":
    main()
