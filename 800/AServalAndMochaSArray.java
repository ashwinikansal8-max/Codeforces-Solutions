import java.io.*;
import java.util.*;

public class AServalAndMochaSArray {

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

    static int gcd(int a,int b){
        if(a==1 || b==1) return 1;
        while(b!=0){
             int t=b;
             b=a%b ;
             a=t; 
        }
        return a;
    }

    public static void main(String[] args) throws Exception {

        int t=nextInt();
        while(t-->0){
            int n =nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=nextInt();

            boolean f=false;
            for(int i=0;i<n;i++){
               for(int j=i+1;j<n;j++){
                 if(gcd(arr[i],arr[j])<=2) f=true;
               }
            }
              
            if(f)
            System.out.println("Yes");
            else System.out.println("No");
            


        }

    }
}