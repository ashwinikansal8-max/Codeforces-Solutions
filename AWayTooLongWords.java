import java.io.*;
import java.util.*;

public class AWayTooLongWords {

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

        int n = nextInt();
        while(n-->0)
        {
            String a = next();
            int len = a.length();
            if(len<=10) System.out.println(a);
            else
                System.out.println(""+a.charAt(0)+(len-2)+(char)a.charAt(len-1));
        }

    }
}