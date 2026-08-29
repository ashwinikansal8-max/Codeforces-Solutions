import java.io.*;
import java.util.*;

public class AOddEraser {

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

    static int gcd(int A,int B)
    {
        int a,b;
        while(A>0)
        {
            a = B%A;
            b = A;
            A = a;
            B = b;
        }
        return B;
    }

    public static void main(String[] args) throws Exception {

        int t = nextInt();
        while(t-->0)
        {
            int n = nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=nextInt();

            System.out.println(gcd(arr[0],arr[n-1]));
        }

    }
}