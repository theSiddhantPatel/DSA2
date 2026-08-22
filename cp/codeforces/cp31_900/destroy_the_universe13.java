import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class destroy_the_universe13 {

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
    int i = 0;
    while (i < n && a[i] == 0) {
      i++;
    }

    if (i == n) {
      System.out.println(0);
      return;
    }
    while (i < n && a[i] > 0) {
      i++;
    }
    while (i < n && a[i] == 0) {
      i++;
    }
    if (i == n) {
      System.out.println(1);
    } else System.out.println(2);

    //String s=next();
    //Character ch=next().charAt(0);
  }

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve();
    }
  }
}
