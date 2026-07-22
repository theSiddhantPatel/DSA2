import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class balanced_round7 {

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
    int k = ni();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = ni();
    }
    Arrays.sort(a);

    int current = 1,
      best = 1;
    //no need of Math.abs after sorting the array
    for (int i = 1; i < n; i++) {
      if ((a[i] - a[i - 1]) <= k) current++;
      else current = 1;
      best = Math.max(best, current);
    }
    System.out.println(n - best);

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
