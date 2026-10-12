import java.io.*;
import java.util.*;

public class AButtons {

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

            if(a==b){
                if(c%2!=0) System.out.println("First");
                else System.out.println("Second");
            }
            else if(a>b) System.out.println("First");
            else System.out.println("Second");
        }

    }
}