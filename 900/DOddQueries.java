import java.io.*;
import java.util.*;

public class DOddQueries {

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
            int n=nextInt();
            int q=nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++) arr[i]=nextInt();

            int[] ps = new int[n];
            ps[0]=arr[0];
            for(int i=1;i<n;i++) ps[i]=ps[i-1]+arr[i];

            while(q-->0)
            {
                int l = nextInt();
                int r = nextInt();
                int k = nextInt();
                
                int left,right;
                if(l-2<0) left = 0;
                else left = ps[l-2];

                if(r-1<0) right = 0;
                else right = ps[r-1];

                int newSum=ps[n-1]-(right-left)+(r-l+1)*k;
                if(newSum%2==0) System.out.println("NO");
                else System.out.println("YES");
            }
        }

    }
}