import java.io.*;
import java.util.*;

public class gameOnTheTrain {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    //int a = Integer.parseInt(next());
    String str = next();
    // long n = Long.parseLong(next());
    //char ch = next().charAt(0);
    //double a=Double.parseDouble(next());
    int n = Integer.parseInt(next());
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(next());
      if (min > x) min = x;
      if (max < x) max = x;
    }
    System.out.println(max + 1 - min);
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
