import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class walking_master23 {

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
    int c = Integer.parseInt(next());
    int d = Integer.parseInt(next());

    // Impossible to decrease y
    if (d < b) {
      System.out.println(-1);
      return;
    }

    int up = d - b; // Required diagonal moves
    int x = a + up; // x after those moves

    // Can't increase x anymore without increasing y
    if (x < c) {
      System.out.println(-1);
      return;
    }

    int left = x - c; // Required left moves

    System.out.println(up + left);

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
