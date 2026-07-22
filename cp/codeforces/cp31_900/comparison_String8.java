import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class comparison_String8 {

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

  static void solve() throws Exception {
    int n = ni();
    String s = next();
    int curr = 1,
      next = 1;
    int max = 0;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '<') {
        curr++;
        next = 1;
      } else {
        next++;
        curr = 1;
      }
      max = Math.max(curr, next);
      ans = Math.max(max, ans);
    }
    System.out.println(ans);
    //Character ch=next().charAt(0);
  }

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve();
    }
  }
}
