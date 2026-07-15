import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class coins22 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    long n = Long.parseLong(next());
    long k = Long.parseLong(next());
    System.out.println(n % 2 == 1 && k % 2 == 0 ? "no" : "yes");
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
