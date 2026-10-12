import java.io.*;
import java.util.*;

public class AUnitedWeStand {

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
            ArrayList<Integer> b= new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            int[] a = new int[n];
            int max=0;
           
            for(int i=0;i<n;i++){
                   a[i]=nextInt();
                   max=Math.max(max,a[i]);
            }
            
            for(int i:a){
                if(i==max) c.add(i);
                else b.add(i);
            }

            if(b.size()==0) System.out.println(-1);
            else{
                System.out.println(b.size()+" "+c.size());
                for(int i: b) System.out.print(i+" ");
                System.out.println();
                for(int i: c) System.out.print(i+" ");
                System.out.println();
            }
        }

    }
}