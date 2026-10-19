import java.io.*;
import java.util.*;

public class ACoins {

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
            long n = nextLong();
            long k = nextLong();

            if(n%2!=0 && k%2==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }

    }
}