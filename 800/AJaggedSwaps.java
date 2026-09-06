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
             
            int c=0;
            

            for(int i=1;i<n-1;i++){
                if((arr[i]>arr[i-1]) && (arr[i]>arr[i+1]))
                {
                    int t = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }

            for(int i=0;i<n-1;i++)
            {
                  if(arr[i]>arr[i+1]) {
                    c++;
                    break;
                }
                
            }

            if(c==0) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}