import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class unit_array19 {

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
    int sum = 0;
    int negative = 0;

    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(next());
      if (x == -1) negative++;
      sum += x;
    }
    int ops = 0;
    while (sum < 0) {
      negative -= 1;
      sum += 2;
      ops++;
    }
    System.out.println(negative % 2 == 0 ? ops : ops + 1);
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
