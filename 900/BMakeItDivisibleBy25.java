import java.io.*;
import java.util.*;

public class BMakeItDivisibleBy25 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static final int MOD = 1_000_000_007;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int[] readArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    static long power(long base, long exp, long mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) res = res * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return res;
    }

    static void shuffle(int[] a) {
        Random rnd = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
        }
    }

    static int cost(String s,char a,char b){
         int i = s.lastIndexOf(b);
         if(i<=0) return Integer.MAX_VALUE;
         int j= s.lastIndexOf(a,i-1);
         if(j<0) return Integer.MAX_VALUE;
         
         return s.length()-j-2;
    }

    static void solve() throws IOException {
        long n = nextLong();
        String s = n+"";
        long ans=Math.min(
            Math.min(cost(s,'0','0'),cost(s,'2','5')),
            Math.min(cost(s,'5','0'),cost(s,'7','5'))
        );

        sb.append(ans).append('\n');
}

    public static void main(String[] args) throws IOException {
        int t = nextInt(); // delete this line and use t = 1 if the problem has a single test
        while (t-- > 0) {
            solve();
        }
        System.out.print(sb);
    }
}