import java.io.*;
import java.util.*;

public class AMakeItZero {

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
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=nextInt();
            
            if(n%2==0){
                System.out.println(2);
                System.out.println(1+" "+n);
                System.out.println(1+" "+n);
            }
            else{
                System.out.println(4);
                System.out.println(1+" "+(n-1));
                System.out.println(1+" "+(n-1));
                System.out.println((n-1)+" "+n);
              System.out.println((n-1)+" "+n);

            }
        }
        
    }
}