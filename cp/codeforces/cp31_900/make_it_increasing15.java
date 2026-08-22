import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class make_it_increasing15 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
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
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = ni();
    }
    int ops = 0;
    int i = n - 2;
    while (i >= 0) {
      while (a[i] >= a[i + 1]) {
        if (a[i] == 0) {
          System.out.println(-1);
          return;
        }
        a[i] /= 2;

        ops++;
      }
      i--;
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
