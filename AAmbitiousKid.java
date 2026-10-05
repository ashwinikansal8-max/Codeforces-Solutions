import java.io.*;
import java.util.*;

public class AAmbitiousKid {

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

        
           int n = nextInt();
           int ans= Math.abs(nextInt());
           for(int i=1;i<n;i++)
           {
             int a = Math.abs(nextInt());
             ans = Math.min(ans,a);
           }
           System.out.println(ans);
        }

    }
