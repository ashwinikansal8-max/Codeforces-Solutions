import java.io.*;
import java.util.*;

public class AHowMuchDoesDaytonaCost {

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

        int t = nextInt();
        while(t-->0)
        {
            int n = nextInt();
            int k = nextInt();
            int c=0;
            for(int i=0;i<n;i++)
            {
                int a = nextInt();
                if(a==k)
                {
                     c++;
                }
            }
            if(c>0) System.out.println("yes");
            else System.out.println("no");
        }

    }
}