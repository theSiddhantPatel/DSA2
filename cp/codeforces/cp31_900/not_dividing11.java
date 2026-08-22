import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class not_dividing11 {

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

  //   static long nl() throws Exception {
  //     return Long.parseLong(next());
  //   }

  static void solve() throws Exception {
    int n = ni();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = ni();
    }

    if (a[0] == 1) a[0]++; //you have to handle for one explicitly

    for (int i = 1; i < n; i++) {
      if (a[i] == 1) a[i]++;

      while (a[i] % a[i - 1] == 0) {
        a[i] = a[i] + 1;
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve();
    }
  }
}
