import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class vasilije_in_cacak3 {

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
    long k = Long.parseLong(next());
    long x = Long.parseLong(next());
    if (x < ((k * (k + 1)) / 2)) System.out.println("NO");
    else if ((n * k - ((k * (k - 1)) / 2) >= x)) System.out.println("YES");
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
