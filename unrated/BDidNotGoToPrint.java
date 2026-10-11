import java.io.*;
import java.util.*;

public class BDidNotGoToPrint {

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
            int n = nextInt(); int doc=1;
            String s = next();
            ArrayList<Integer> a = new ArrayList<>();
            HashSet<Integer> pt = new HashSet<>();
            for(int i=0;i<n;i++)
            {
                char c = s.charAt(i);
                if(c=='1')
                {
                    a.add(doc);
                }
                else if(c=='2')
                {
                    if(a.size()!=0)
                    {
                        int top = a.remove(a.size()-1);
                        pt.add(top);
                    } 
                    else pt.add(doc);
                }
                else if(c=='3')
                {
                    pt.add(doc);
                }
                doc++;
            }
            
        ArrayList<Integer> arr = new ArrayList<>();
            for ( doc = 1; doc <= n; doc++) {
                if (!pt.contains(doc)) {
                    arr.add(doc);
                }
            }
            
            System.out.println(arr.size());
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}