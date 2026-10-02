import java.io.*;
import java.util.*;

public class CSkiResort {

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
        while(t-->0)
        {
            int n = nextInt();
            int k = nextInt();
            int q = nextInt();
            long ans=0,days=0;

            for(int r=0;r<n;r++)
            {   
            int arr = nextInt();
                
                if(arr<=q){
                    days++;
                }
                else {
                    days=0;
                    continue;
                }

                 if(days>=k) ans=ans+(days-k+1);
                
            }
            
           System.out.println(ans);
        }

    }
}