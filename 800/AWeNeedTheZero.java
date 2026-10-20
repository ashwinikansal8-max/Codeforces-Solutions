import java.io.*;
import java.util.*;

public class AWeNeedTheZero {

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
            int n=nextInt();

            int ans=0;
            for(int i=0;i<n;i++){
                int a = nextInt();
                ans = ans^a;
            }
            
            if(n%2!=0) System.out.println(ans);
            else{
                if(ans==0) System.out.println(0);
                else System.out.println(-1);
            }


        }

    }
}