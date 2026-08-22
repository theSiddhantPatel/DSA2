import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class avtoBus14 {

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
    long n = nl();
    if (n % 2 != 0 || n < 4) System.out.println(-1);
    else {
      long min = (n + 5) / 6;
      long max = (n) / 4;
      System.out.println(min + " " + max);
    }
  }

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve();
    }
  }
}
