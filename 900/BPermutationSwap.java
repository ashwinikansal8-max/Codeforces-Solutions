import java.io.*;
import java.util.*;

public class BPermutationSwap {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

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

    static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

    public static void main(String[] args) throws Exception {

        int t=nextInt();
        while(t-->0){
            int n=nextInt();
            int gcd=0;
            for(int i=1;i<=n;i++){
                int a = nextInt();
                gcd=gcd(gcd,Math.abs(a-i));
            }
            System.out.println(gcd);
        }

    }
}