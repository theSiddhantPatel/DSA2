import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prepend_and_append25 {

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
    String str = next();
    int i = 0;
    int len = n;
    while (n > 0) {
      if (str.charAt(i) == '0' && str.charAt(len - i - 1) == '1') n -= 2;
      else if (str.charAt(i) == '1' && str.charAt(len - i - 1) == '0') n -= 2;
      else break;
      i++;
    }
    System.out.println(n);

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
