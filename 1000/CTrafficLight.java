import java.io.*;
import java.util.*;

public class CTrafficLight {

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
            char c = next().charAt(0);
            String s=next();
            
            if(c=='g'){
                System.out.println(0);
                continue;
            }
            
            String d = s+s;
            int len=0;
            int ans=0,count=0;
            for(int i=2*n-1;i>=0;i--)
            {
                if(d.charAt(i)=='g') len=i;

                if(i<n && d.charAt(i)==c)
                ans = Math.max(ans,len-i);
            }
             
            System.out.println(ans);
        }

    }
}