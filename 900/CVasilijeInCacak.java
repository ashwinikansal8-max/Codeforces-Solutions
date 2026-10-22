import java.io.*;
import java.util.*;

public class CVasilijeInCacak {

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
            long n=nextLong();
            long k=nextLong();
            long x=nextLong();

                long max=0,min=0;
                
                min = (k*(k+1))/2;
                max = (n*(n+1))/2 - ((n-k)*((n-k)+1))/2;

                if(x<=max && x>=min)
                System.out.println("YES");
                else System.out.println("NO");

                
        }

    }
}