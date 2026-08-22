import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mainak_and_array12 {

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

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve();
    }
  }

  private static void solve() throws Exception {
    // First loop
    int n = ni();
    int[] a = new int[n];
    int ans = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      a[i] = ni();
    }

    //first loop
    for (int i = 0; i < n; i++) {
      ans = Math.max(ans, a[(i - 1 + n) % n] - a[i]);
    }

    // Second loop
    for (int i = 1; i < n; i++) {
      ans = Math.max(ans, a[i] - a[0]);
    }

    // Third loop
    for (int i = 0; i < n - 1; i++) {
      ans = Math.max(ans, a[n - 1] - a[i]);
    }

    System.out.println(ans);
  }
}
//
//Keep the last element fixed, minimize the first.
//Rotate the whole array.
