import java.io.*;
import java.util.*;

public class AOneAndTwo {

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
            int n=nextInt();
            int c=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {arr[i]=nextInt();
            if(arr[i]==2) c++;
        }
         
        if(c%2!=0)
        System.out.println(-1);
        else{
            if(c==0) System.out.println(1);
            else{
                int a=c/2;
                for(int i=0;i<n;i++){
                if(arr[i]==2) c--;
                if(c==a){
                    System.out.println(i+1);
                    break;
                }
               } 
            }        
        }

        }

    }
}