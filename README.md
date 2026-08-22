# Codeforces Solutions

Personal archive of my [Codeforces](https://codeforces.com/) problem solutions in Java, organized automatically by problem rating. Built while training with [TLE Eliminators](https://www.tle-eliminators.com/) CP-31 and working through my CS coursework at IIIT Nagpur.

## 📁 Repository Structure

Solutions are auto-sorted into folders named by Codeforces rating:

```
codeforces-solutions/
├── 800/
│   ├── AWatermelon.java
│   └── ...
├── 900/
│   ├── AHalloumiBoxes.java
│   └── ...
├── 1000/
│   └── ...
├── unrated/
│   └── (problems without a public CF rating)
├── organize_by_rating.py
└── README.md
```

Each folder groups problems of equal difficulty, making it easy to review or revisit a specific rating band.

## 🛠 How Solutions Are Organized

Solutions are sorted using [`organize_by_rating.py`](./organize_by_rating.py), a script that:

1. Reads problem metadata saved locally by the [CPH (Competitive Programming Helper)](https://github.com/agrawal-d/cph) VS Code extension
2. Queries the [Codeforces API](https://codeforces.com/apiHelp) to fetch each problem's official rating
3. Moves the corresponding solution file into a folder named after that rating

This keeps the repo self-organizing — no manual sorting required after solving a problem.

### Usage

```bash
python organize_by_rating.py
```

Run this from the repo root after solving one or more problems with CPH.

## 💻 Tech / Tools

- **Language:** Java
- **Editor:** VS Code
- **Judge helper:** CPH (Competitive Programming Helper)
- **Automation:** Python (rating classification via Codeforces API)

## 📈 Purpose

This repo serves as:
- A structured, difficulty-ordered record of problems solved
- A way to track progress across rating bands over time
- A reference to revisit past approaches before attempting harder problems

## 🔗 Links

- [Codeforces Profile](https://codeforces.com/profile/ashwinikansal8)
---

*Maintained by Ashwini · IIIT Nagpur*
