import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class we_need_the_zero24 {

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
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(next());
    }

    int xor = 0;
    for (int i = 0; i < n; i++) {
      xor ^= a[i];
    }
    if (n % 2 == 0) {
      if (xor == 0) System.out.println(0);
      else System.out.println(-1);
    } else System.out.println(xor);
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
