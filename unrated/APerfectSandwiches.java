import java.io.*;
import java.util.*;

public class APerfectSandwiches {

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
            int b= nextInt();

            if(a>b && a>1){
                 
                    System.out.println(Math.min(b,a-b));
                 }
                 else 
            {
                System.out.println(-1);
            }
            }
            
        }

    }
