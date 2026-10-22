import java.io.*;
import java.util.*;

public class BLongestDivisorsInterval {

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

    public static void main(String[] args) throws Exception {

        int t=nextInt();
        while(t-->0){
            long n=nextLong();
            int i=1;
            while(n%i==0) i++;
            System.out.println(i-1);
        }

    }
}