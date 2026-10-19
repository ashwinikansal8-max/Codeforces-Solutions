import java.io.*;
import java.util.*;

public class AUnitArray {

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

        int t =nextInt();
        while(t-->0){
            int n = nextInt();
            int neg=0,pos=0;
            for(int i=0;i<n;i++){
                int a= nextInt();
                if(a==-1) neg++;
                else pos++;
            }

            int op=0;
            if(neg%2!=0){
                neg--; pos++;
                op++;
            }

            while(neg>pos){
                neg=neg-2;
                pos=pos+2;
                op=op+2;
            }

            System.out.println(op);
        }

    }
}