import java.io.*;
import java.util.*;

public class ATeam {

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
        int ans=0;
        while (n-->0) {
            int a = nextInt();
            int b = nextInt();
            int c = nextInt();
            
            if(a*b==1 || b*c==1 || a*c==1)
                ans++;
        }
System.out.println(ans);
    }
}