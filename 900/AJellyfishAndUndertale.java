import java.io.*;
import java.util.*;

public class AJellyfishAndUndertale {

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
        while(t-->0){
            int a=nextInt();
            int b=nextInt();
            int n=nextInt();

            long ans=b;
            for(int i=0;i<n;i++){
                int arr = nextInt();
                if(arr>=a) ans+=a-1;
                else ans+=arr;
            }
           
            System.out.println(ans);
        }
    }
}