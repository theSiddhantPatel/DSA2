import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class greedy {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");

    static String next() throws Exception {
        while (!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static void solve() throws Exception {
        int n = Integer.parseInt(next());
        String s = next();
        int i = 0;
        int l = n;
        while (i < n && s.charAt(i) == 'W') {
            l--;
            i++;
        }
        int j=n - 1;
        while (j > i && s.charAt(j) == 'W') {
            j--;
            l--;
        }
        System.out.println(l);
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(next());
        while (t-- > 0) {
            solve();
        }
    }
}
