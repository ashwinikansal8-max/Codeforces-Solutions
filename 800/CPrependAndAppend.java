import java.io.*;
import java.util.*;

public class CPrependAndAppend {

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
            String s=next();
            int l=0,r=n-1;
            while(l<=r){
                char lt=s.charAt(l);
                char rt=s.charAt(r);
               if((lt=='1'&&rt=='0')||(lt=='0'&&rt=='1')){
                 l++; r--;
               }
               else break;
            }
           
            System.out.println(r-l+1);
        }

    }
}