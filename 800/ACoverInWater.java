import java.io.*;
import java.util.*;

public class ACoverInWater {

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
            String s = next();
            
            int check=0,c=0;
            for(int i=0;i<n;i++)
            {
               if(s.charAt(i)=='.') c++;
               if((i>0 && i<n-1) && (s.charAt(i-1)=='.' && s.charAt(i+1)=='.' && s.charAt(i)=='.')){
                check=1;
                break;
               }
            }

            if(check==1) System.out.println(2);
            else System.out.println(c);
        }

    }
}