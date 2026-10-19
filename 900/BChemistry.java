import java.io.*;
import java.util.*;

public class BChemistry {

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
            int n = nextInt();
            int k = nextInt();
            String s = next();
            int c=0;
            HashMap<Character,Integer> hm = new HashMap<>();

            for(int i=0;i<n;i++){
                hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            }

            for(int count : hm.values()){
                if(count%2!=0){
                      c++;
                }
            }
            
            if(c<=k || c-1==k) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}