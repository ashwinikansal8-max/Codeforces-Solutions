import java.io.*;
import java.util.*;

public class BNotDividing {

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

    static void solve() throws IOException {
        int n=nextInt();
         int arr[] = readArray(n);
        
         if(arr[0]==1) arr[0]++;
         for(int i=1;i<n;i++){
            if(arr[i]==1) arr[i]++;
            if((arr[i]%arr[i-1])==0) arr[i]++;
         }

         for(int i: arr) sb.append(i).append(" ");
         sb.append('\n');
    }

    public static void main(String[] args) throws IOException {
        int t = nextInt(); // delete this line and use t = 1 if the problem has a single test
        while (t-- > 0) {
            solve();
        }
        System.out.print(sb);
    }
}