import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class grasshopper_on_a_line18 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    int x = Integer.parseInt(next());
    int k = Integer.parseInt(next());
    if (x % k > 0) {
      System.out.println(1);
      System.out.println(x);
    } else {
      System.out.println(2);
      System.out.println(x - k + 1 + " " + (k - 1)); //think about this line
    }

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
