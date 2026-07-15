import java.io.*;
import java.util.*;

public class array_coloring15 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    int n = Integer.parseInt(next());

    int[] a = new int[n];
    int count = 0;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(next());
      if (a[i] % 2 == 1) count++;
    }
    System.out.println(count % 2 == 1 ? "NO" : "YES");
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
