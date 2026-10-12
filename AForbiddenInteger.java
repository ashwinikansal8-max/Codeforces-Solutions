import java.io.*;
import java.util.*;

public class AForbiddenInteger {

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
            int k = nextInt();
            int x = nextInt();
            if((x==1 && n==1) || (k==1 && x==1)){
                System.out.println("NO");
                continue;
            }
            
            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for(int i=1;i<=n;i++){
                  System.out.print(1+" ");
                }
                System.out.println();
            }
            else if(n!=1){
                if(n%2==0){
                   System.out.println("YES");
                   System.out.println(n/2);
                   for(int i=2;i<=n;i=i+2){
                  System.out.print(2+" ");
                }
                System.out.println();
                }
                else if(k>=3){
                     System.out.println("YES");
                     System.out.println(1+(n-3)/2);
                      System.out.print(3+" ");
                   for(int i=2;i<=n-3;i=i+2){
                  System.out.print(2+" ");
                }
                System.out.println();
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}