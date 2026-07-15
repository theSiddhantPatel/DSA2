import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class blank_space21 {

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
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(next());
    }
    int len = 0,
      maxLen = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == 0) {
        len++;
        maxLen = Math.max(len, maxLen);
      } else len = 0;
    }
    System.out.println(maxLen);
    // String str = next();
    // long n = Long.parseLong(next());
    //char ch = next().charAt(0);
    //double a=Double.parseDouble(next());
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
