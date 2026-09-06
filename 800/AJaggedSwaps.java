import java.io.*;
import java.util.*;

public class AJaggedSwaps {

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

        int test = nextInt();
        while(test-->0)
        {
            int n = nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=nextInt();
             
          System.out.println(arr[0] == 1 ? "YES" : "NO");        }
    }
}