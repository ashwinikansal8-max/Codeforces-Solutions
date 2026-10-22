import java.io.*;
import java.util.*;

public class DBalancedRound {

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
                        int k=nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
    arr[i] = nextInt();
}
            if(n==1){
                System.out.println(0);
                continue;
            }
            
            Arrays.sort(arr);
            int max=0,curr=0;
            for(int i=0;i<n-1;i++){
                if((arr[i+1]-arr[i])<=k) curr++;
                else curr=0;
                max=Math.max(curr+1,max);
            }
            System.out.println(n-max);
        }

    }
}