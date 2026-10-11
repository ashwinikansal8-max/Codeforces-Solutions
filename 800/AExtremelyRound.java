import java.io.*;
import java.util.*;

public class AExtremelyRound {

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
        while(t-->0)
        {
            int n = nextInt();
            int c=0;
            
            if(n<=9){
                System.out.println(n);
            }
            else
            if(n<=100)
            {
                while(n-10>0)
            {
                n=n-9;
                c++;
            }
            System.out.println(9+c);
            }
            else{
                 int nd=0,cnz=0;
                 while(n!=0)
                 {
                   nd++;
                   if(n%10!=0) cnz++;
                   n=n/10;
                 }
            }
            
        }

    }
}