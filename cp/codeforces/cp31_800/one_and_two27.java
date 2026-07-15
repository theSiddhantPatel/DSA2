import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class one_and_two27 {

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
    double[] a = new double[n];
    int twos = 0;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(next());
      if (a[i] == 2) twos++;
    }
    int preTwos = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == 2) preTwos++;
      if (preTwos * 2 == twos) {
        System.out.println(i + 1);
        return;
      }
    }
    System.out.println(-1);

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
