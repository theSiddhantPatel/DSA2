import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jellyfish_and_undertale4 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    int a = Integer.parseInt(next());
    int b = Integer.parseInt(next());
    int n = Integer.parseInt(next());
    int[] x = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = Integer.parseInt(next());
    }
    long ans = b;
    for (int i = 0; i < n; i++) {
      ans += Math.min(x[i], a - 1);
    }
    System.out.println(ans);
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
