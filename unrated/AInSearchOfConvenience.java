import java.io.*;
import java.util.*;

public class AInSearchOfConvenience {

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
            int x=nextInt();
            int y = nextInt();
            int r= nextInt();
            int exp=0;
            for(int i=x-r;i<=x+r;i++)
            {
                for(int j=y-r;j<=y+r;j++)
                {
                    exp = (i-x)*(i-x)+(j-y)*(j-y);
                    if(exp==r*r){
                        System.out.println(i+" "+j);
                        break;
                    } 
                }
                
                    if(exp==r*r){
                        
                        break;
                    } 
            }

        }

    }
}