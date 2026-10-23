import java.io.*;
import java.util.*;

public class BComparisonString {

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
            String s=next();
            
            int Currcost=2,max=2;
            char start = s.charAt(0);
            for(int i=1;i<n;i++){
               char c= s.charAt(i);
               if(start==c) Currcost++;
               else{
                  start = c;
                  Currcost=2;
               }
               max = Math.max(Currcost,max);
            }
            System.out.println(max);
        }

    }
}