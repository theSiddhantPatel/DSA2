import java.io.*;
import java.util.*;

public class goalsOfVictory9 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");

    static String next() throws Exception {
        while (!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static void solve() throws Exception {
        int n = Integer.parseInt(next());
        int[] a = new int[n];
        for (int i = 0; i < n - 1; i++) {
            a[i] = Integer.parseInt(next());
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += a[i];
        }
        System.out.println(-sum);

    }
    // String str = next();
    // long n = Long.parseLong(next());
    // char ch = next().charAt(0);
    // double a=Double.parseDouble(next());

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(next());
        while (t-- > 0) {
            solve();
        }
    }
}