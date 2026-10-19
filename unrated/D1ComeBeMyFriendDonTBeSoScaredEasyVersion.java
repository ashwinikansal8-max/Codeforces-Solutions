import java.io.*;
import java.util.*;

public class D1ComeBeMyFriendDonTBeSoScaredEasyVersion {

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
        while(t-->0){
            int n = nextInt();
            int m = nextInt();
            int k = (n+1)/2;
            if(n>1)
            System.out.println(k);
            else System.out.println(0);
            if(n>1)
            {
                for(int i=1;i<=k;i++){
                  System.out.println(i+" "+(i+k-1));
            }
              
            }
        }
    }
}