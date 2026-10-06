import java.io.*;
import java.util.*;

public class AOddDivisor {

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

        int test =nextInt();
        while(test-->0)
        {
            long n = nextLong();
            long t=n;

            while(t%2==0)
            t=t/2;

            if(t>1) System.out.println("YES");
            else
            System.out.println("NO");
        }

    }
}