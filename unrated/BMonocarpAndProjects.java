import java.io.*;
import java.util.*;

public class BMonocarpAndProjects {

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

         int test = nextInt();
        while(test-->0)
        {
            int x = nextInt();
            int y = nextInt();
            long k = nextLong();

           int d = y-x;
           long c=0;

           while(y%x!=d && k!=0)
           {
            k--;
            c = c + (y%x);
            y++; x++;
           }
           if(k>0)
           c = c + (k*d);
           System.out.println(c);
        }
    }
}