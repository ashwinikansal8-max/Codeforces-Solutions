import java.io.*;
import java.util.*;

public class ADonTTryToCount {

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
            int m = nextInt();
            String x = next();
            String s = next();

            if(x.contains(s)){
                System.out.println(0);
                continue;
            }
            
            int c=0;
            for(int i=0;i<6;i++)
            {
                x = x+x; c++;
                if(x.contains(s)){
                    break;
                }
                
            }

            if(!x.contains(s)) System.out.println(-1);
            else System.out.println(c);
        }

    }
}