import java.io.*;
import java.util.*;

public class ARobotOddMoves {

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
            int a = nextInt();
            int b= nextInt();
            int op;

            if((a-b)%2==0){
                if(b>a) op=-1;
                else op=a;
            }
            else{
                if(b<=a+1) op=a+1;
                else op=-1;
            }
        System.out.println(op);

        }

    }
}