import java.io.*;
import java.util.*;

public class ALineTrip {

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
             int x = nextInt();

             int[] a = new int[n];
             for(int i=0;i<n;i++) a[i] = nextInt();
          
             int ans=a[0];

             for(int i=1;i<n;i++)
             {
                ans = Math.max(ans,a[i]-a[i-1]);
             }
            ans = Math.max(ans, 2 * (x - a[n-1]));   
             System.out.println(ans);
        }

    }
}