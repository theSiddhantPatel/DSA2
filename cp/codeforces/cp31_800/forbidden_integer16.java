import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class forbidden_integer16 {

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
    int k = Integer.parseInt(next());
    int x = Integer.parseInt(next());

    if (x != 1) {
      System.out.println("YES");
      System.out.println(n);
      for (int i = 0; i < n; i++) {
        System.out.print(1 + " ");
      }
      System.out.println();
    } else if (k >= 2 && n % 2 == 0) {
      System.out.println("YES");
      System.out.println(n / 2);
      for (int i = 0; i < n / 2; i++) {
        System.out.print(2 + " ");
      }
      System.out.println();
    } else if (k >= 3 && n % 2 == 1) {
      System.out.println("YES");
      System.out.println(n / 2);
      for (int i = 0; i < n / 2 - 1; i++) {
        System.out.print(2 + " ");
      }
      System.out.print(3);
      System.out.println();
    } else System.out.println("NO");

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
