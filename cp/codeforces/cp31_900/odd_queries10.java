import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class odd_queries10 {

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
    int q = ni();
    int[] a = new int[n];
    long sum = 0;
    for (int i = 0; i < n; i++) {
      a[i] = ni();
      sum += a[i];
    }

    while (q-- > 0) {
      //too slow use prefix sum approach
      int l = ni();
      int r = ni();
      int k = ni();
      long addition = 0;
      for (int i = l - 1; i < r; i++) {
        addition += a[i];
      }
      long newSum = sum - addition + k * ((r - l) + 1);
      if (newSum % 2 == 1) System.out.println("YES");
      else System.out.println("NO");
    }
    //String s=next();
    //Character ch=next().charAt(0);
  }

  static void solve2() throws Exception {
    int n = ni();
    int q = ni();
    int[] a = new int[n];
    long sum = 0;
    for (int i = 0; i < n; i++) {
      a[i] = ni();
      sum += a[i];
    }
    long[] pref = new long[n + 1];

    for (int i = 1; i <= n; i++) {
      pref[i] = pref[i - 1] + a[i - 1];
    }
    while (q-- > 0) {
      // prefix sum approach
      int l = ni();
      int r = ni();
      int k = ni();
      long querySum = pref[r] - pref[l - 1];

      long newSum = sum - querySum + 1L * k * ((r - l) + 1);
      //1L means make calculations in long multiply with 1, same as (long)conversion
      /*According to the constraints:
k ≤ 10^9
r - l + 1 ≤ 2 × 10^5
Their product can be:
10^9 × 2 × 10^5 = 2 × 10^14
which is far larger than Integer.MAX_VALUE ≈ 2.1 × 10^9.
Fix
Force the multiplication to happen in long:
long newSum = sum - querySum + 1L * k * (r - l + 1);
or
long newSum = sum - querySum + (long) k * (r - l + 1); 
*/
      if (newSum % 2 == 1) System.out.println("YES");
      else System.out.println("NO");
    }
  }

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve2();
    }
  }
}
