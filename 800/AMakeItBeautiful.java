import java.io.*;
import java.util.*;

public class AMakeItBeautiful {

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

        int test=nextInt();
        while(test-->0){
            int n =nextInt();
            int[] arr = new int[n];
            int max=Integer.MIN_VALUE,idx,min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {
                arr[i]=nextInt();
                if(arr[i]>max){
                    idx=i;
                    max=arr[i];
                }
                min=Math.min(min,arr[i]);                
            }
            
            if(max==min){
                System.out.println("NO");
                continue;
            }
            
            Arrays.sort(arr);
            System.out.println("YES");
            
            System.out.print(max+" ");
            for(int i=0;i<n-1;i++)
            {    
                 System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
}