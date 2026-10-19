import java.io.*;
import java.util.*;

public class BReplaceAndCompress {

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
            String s = next();
            boolean inc  = false;
            boolean dec = false;
            int a=1;

            for(int i=1;i<s.length()-1;i++){
                char prev=s.charAt(i-1);
                char next = s.charAt(i+1);
                char curr = s.charAt(i);
                if(prev==next && curr==next) inc=true;
                else if(prev==next && curr!=next) dec=true;
            }
            
            if(inc) a++;
                if(dec) a++;
            System.out.println(a);
        }

    }
}