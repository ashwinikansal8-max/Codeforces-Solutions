import java.io.*;
import java.util.*;

public class BSequenceGame {

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
            ArrayList<Integer> arr = new ArrayList<>();
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
               nums[i]=nextInt();
            }
            
            arr.add(nums[0]);
            for(int i=1;i<n;i++){
               if(nums[i]>=nums[i-1]) arr.add(nums[i]);
               else {
                arr.add(nums[i]);
                arr.add(nums[i]);
               }
            }

           System.out.println(arr.size());
           for(int i: arr) System.out.print(i+" ");
           System.out.println();
        }

    }
}