import java.io.*;
import java.util.*;

public class BMexGame {

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
            int n=nextInt();
            int k=nextInt();
            HashMap<Integer,Integer> hm = new HashMap<>();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                 a[i]=nextInt();
                 hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            }
            
            boolean f=false;
            for(int i=0;i<=n+1;i++){
                 int c = hm.getOrDefault(i,0);
                 if(c<2*k-1) break;
                 if(c==2*k-1) {
                    f=true;
                    break;
                 }

            }
            if(f==true) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}