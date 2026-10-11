import java.io.*;
import java.util.*;

public class AEverybodyLikesGoodArrays {

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
            int c=0;
              int n=nextInt();
              int[] a = new int[n];
              a[0]=nextInt();
              for(int i=1;i<n;i++)
              { 
                a[i]=nextInt();
                if ((a[i-1] % 2 == 0 && a[i] % 2 == 0) || (a[i-1] % 2 != 0 && a[i] % 2 != 0)) 
                {
                        c++;
                  }
              }

              System.out.println(c);
        }

    }
}