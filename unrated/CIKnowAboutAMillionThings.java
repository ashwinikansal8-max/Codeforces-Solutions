import java.io.*;
import java.util.*;

public class CIKnowAboutAMillionThings {

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
            int n = nextInt();
            int odd=0,even=0;
            for(int i=0;i<n;i++){
                int a = nextInt();
                if(a%2==0) even++;
                else odd++;
            }

            String m = "Moggity";
            String l = "Larpity";

            if((even==1 && odd==1)|| (odd==3 && even==0))
            System.out.println(l);
            else 
            System.out.println(m);
        }

    }
}