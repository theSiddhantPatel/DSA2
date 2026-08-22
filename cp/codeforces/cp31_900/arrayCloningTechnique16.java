import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class arrayCloningTechnique16 {

    static BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");

    static String next() throws Exception {
        while (!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static int ni() throws Exception {
        return Integer.parseInt(next());
    }

    static long nl() throws Exception {
        return Long.parseLong(next());
    }

    static void solve() throws Exception {
        int n = ni();
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            int a = ni();
            map.put(a, map.getOrDefault(a, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(a));
        }

        // map.put(5, 3);
        // System.out.println(map.get(5)); // prints 3
        // System.out.println(map.get(10)); // prints null
        int ops = 0;
        int curFreq = maxFreq;
        while (curFreq < n) {
            ops++; // Clone operation
            int copyElements = Math.min(n - curFreq, curFreq);
            ops += copyElements; // Swap operations
            curFreq += copyElements;
        }
        System.out.println(ops);
    }

    public static void main(String[] args) throws Exception {
        int t = ni();
        while (t-- > 0) {
            solve();
        }
    }
}
