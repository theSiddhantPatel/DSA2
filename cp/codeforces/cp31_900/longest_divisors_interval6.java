import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class longest_divisors_interval6 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static int ni() throws Exception {
    return Integer.parseInt(next());
  }

  static long nl() throws Exception {
    return Long.parseLong(next());
  }

  static void solve() throws Exception {
    long n = nl();
    int i = 1;
    int maxInterval;
    while (n % i == 0) {
      i++;
    }
    maxInterval = i - 1;
    System.out.println(maxInterval);

    //String s=next();
    //Character ch=next().charAt(0);
  }

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve();
    }
  }
}
