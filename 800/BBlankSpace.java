import java.io.*;
import java.util.*;

public class BBlankSpace {

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
            for(int i=0;i<n;i++) arr[i]=nextInt();

            int len=0,max=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0) len++;
                else{
                    len=0;
                }
                max = Math.max(len,max);
            }
            System.out.println(max);
        }

    }
}