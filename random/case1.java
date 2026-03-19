import java.io.*;
import java.util.*;

public class case1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");

    static String next() throws Exception {
        while (!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(next());
        while (t-- > 0) {
            int n = Integer.parseInt(next());
//        long l = Long.parseLong(next());
//        double d = Double.parseDouble(next());
//        char c = next().charAt(0);
//        String s = next();
            // solve

            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(next());
            }
            int idx = 0,max=0;
            for (int i = 1; i < n; i++) {
                if (max<p[i]) {
                    max=p[i];
                    idx = i;
                }
            }
            int j=0;
            if(p[0]>p[idx]){
                System.out.print(p[0]+" ");
                j=1;
            }
            for(int i=idx;i>=j;i--){
                System.out.print(p[i]+" ");
            }
            for(int i=idx+1;i<n;i++){
                System.out.print(p[i]+" ");
            }
            System.out.println();
        }
    }
}

