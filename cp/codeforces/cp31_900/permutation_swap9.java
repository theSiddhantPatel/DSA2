import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class permutation_swap9 {

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
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = ni();
    }
    //int ans = Math.abs(p[0] - 1);// bcz in gcd y==0 return x , no problem
    //gcd(0, x) = x
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int diff = Math.abs(p[i] - (i + 1));
      if (diff > 0) {
        ans = gcd(ans, diff);
      }
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve();
    }
  }
}
