import java.io.*;
import java.util.*;

public class dontTryToCount7 {

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
    int m = Integer.parseInt(next());
    String x = next();
    String s = next();
    int count = 0;

    while (x.contains(s) != true && x.length() < 300) {
      x = x + x;
      count++;
    }
    System.out.println(x.contains(s) == true ? count : -1);
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
