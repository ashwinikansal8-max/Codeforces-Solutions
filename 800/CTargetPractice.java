import java.io.*;
import java.util.*;

public class CTargetPractice {

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

            int ans=0;
            for(int i=0;i<10;i++){
                String s = next();
                for(int j=0;j<10;j++){
                    char c = s.charAt(j);
                    if(c=='X'){
                        int c1= Math.min(i,j); int c2=Math.min(9-i,9-j);
                         ans += (1 + Math.min(c1,c2));
                    }
                } 
            }
            System.out.println(ans);
        }

    }
}