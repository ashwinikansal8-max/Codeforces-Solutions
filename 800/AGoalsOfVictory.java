import java.io.*;
import java.util.*;

public class AGoalsOfVictory {

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
            int pos=0,neg=0;
            int n = nextInt();
            for(int i=0;i<n-1;i++)
            {
                int a = nextInt();
                if(a<0) neg += a;
                else pos += a;
            }

            neg = Math.abs(neg);
            if(neg>pos) System.out.println(neg-pos);
            else System.out.println(-(pos-neg));
        }

    }
}