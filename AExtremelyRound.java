import java.io.*;
import java.util.*;

public class AExtremelyRound {

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
            int digits=0,num=n,fp=0;
            while(num>0){
                digits++;
                if(num/10==0) fp=num;
                num=num/10;
            }

            int ans= 9*(digits-1) + fp;
            System.out.println(ans);
        }

    }
}