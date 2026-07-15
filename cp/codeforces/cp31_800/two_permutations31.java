import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class two_permutations31 {

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
    int a = Integer.parseInt(next());
    int b = Integer.parseInt(next());
    if (a == n && b == n) System.out.println("YES");
    else if (a + b + 2 <= n) System.out.println("YES");
    else System.out.println("NO");

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
