import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class make_it_zero5 {

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
    if (n % 2 == 0) {
      System.out.println(2);
      System.out.println(1 + " " + n);
      System.out.println(1 + " " + n);
    } else {
      System.out.println(4);
      System.out.println(1 + " " + (n - 1));
      System.out.println(1 + " " + (n - 1));
      System.out.println(2 + " " + (n));
      System.out.println(2 + " " + (n));
    }
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
