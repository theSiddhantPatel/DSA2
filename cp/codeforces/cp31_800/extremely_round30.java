import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class extremely_round30 {

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
    int exRounds = 0;
    int[] a = {
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      20,
      30,
      40,
      50,
      60,
      70,
      80,
      90,
      100,
      200,
      300,
      400,
      500,
      600,
      700,
      800,
      900,
      1000,
      2000,
      3000,
      4000,
      5000,
      6000,
      7000,
      8000,
      9000,
      10000,
      20000,
      30000,
      40000,
      50000,
      60000,
      70000,
      80000,
      90000,
      100000,
      200000,
      300000,
      400000,
      500000,
      600000,
      700000,
      800000,
      900000,
    };
    for (int i = 0; i < a.length; i++) {
      if (a[i] <= n) exRounds++;
      else break;
    }
    System.out.println(exRounds);
  }

  static void solve2() throws Exception {
    int n = Integer.parseInt(next());

    int ans = 0;

    for (int p = 1; p <= n; p *= 10) {
      for (int d = 1; d <= 9; d++) {
        if (d * p <= n) ans++;
      }
    }

    System.out.println(ans);
  }

  //even better mathematical approach:
  static void solve3() throws Exception {
    int n = Integer.parseInt(next());
    int digits = (int) Math.log10(n) + 1;
    int firstDigit = n / (int) Math.pow(10, digits - 1);
    System.out.println(firstDigit + 9 * (digits - 1));
  }

  // String str = next();
  // long n = Long.parseLong(next());
  //char ch = next().charAt(0);
  //double a=Double.parseDouble(next());

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve3();
    }
  }
}
