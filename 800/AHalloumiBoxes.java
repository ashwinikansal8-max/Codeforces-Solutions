import java.io.*;
import java.util.*;

public class AHalloumiBoxes {

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

         Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean sorted = true;
           
            for(int i=1;i<n;i++)
            {
                 if(arr[i]<arr[i-1]) {
                    sorted = false;
                    break;
                 }
            }

            if(k>1 || sorted) out.append("yes\n");
            else out.append("No\n");
    }
    System.out.println(out);
}
}