import java.io.*;
import java.util.*;

public class ADesorting {

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
            int[] arr = new int[n];
            boolean f=false;
            arr[0]=nextInt();
            int min_diff = Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                arr[i]=nextInt();
                if(arr[i]<arr[i-1]) f=true;
                min_diff = Math.min(min_diff,arr[i]-arr[i-1]);
            }
            
            
            if(!f){
    
                 System.out.println((min_diff)/2+1);
            }
            else System.out.println(0);
        }

    }
}