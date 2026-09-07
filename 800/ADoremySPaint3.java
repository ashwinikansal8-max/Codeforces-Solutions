import java.io.*;
import java.util.*;

public class ADoremySPaint3 {

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
        while(t-->0)
        {
            int n = nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=nextInt();
            
            HashMap<Integer,Integer> hs = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(hs.containsKey(arr[i])) hs.put(arr[i],hs.get(arr[i])+1);
                else hs.put(arr[i],1);
            }

            if(hs.size()>2) System.out.println("no");
            else if(hs.size()==1) System.out.println("yes");
            else{
                int fc=0,sc=0,idx=0;

                for(int count: hs.values()){
                    if(idx==0) fc = count;
                    else sc = count;

                    idx++;
                }

                if(Math.abs((fc-sc))<=1) System.out.println("yes");
                else System.out.println("no");
            }
        }

    }
}