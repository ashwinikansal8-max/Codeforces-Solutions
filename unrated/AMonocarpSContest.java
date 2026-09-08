//hello
import java.io.*;
import java.util.*;

public class AMonocarpSContest {

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
            
            int c=0,t=0;
            if(arr[0]==1) t++;
            if(arr[n-1]==1) t++;

            for(int i=0;i<n;i++)
            {
                if(arr[i]==0) c++;
            }
            
            if(t==0) System.out.println(0);
            else {
               if(c<2) System.out.println(-1);
               else if(t==1) System.out.println(1);
               else 
                  System.out.println(2);
            }

           
        }
    }
}