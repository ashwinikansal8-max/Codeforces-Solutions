import java.io.*;
import java.util.*;

public class AWalkingMaster {

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
           int a = nextInt();
           int b = nextInt();
            int c = nextInt();
            int d = nextInt();
            int ans;
            if(a==c && b==d){
              System.out.println(0);
              continue;
            }
            if(b<=d){
              ans=d-b;
              a= a + ans;
              if(a<c) ans=-1;
              else if(a>c) ans += (a-c);
            }
            else{
               ans=-1;
            }
             
            
            System.out.println(ans);

        }

    }
}