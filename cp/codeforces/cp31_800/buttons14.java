import java.io.*;
import java.util.*;

public class buttons14 {

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
    if (c % 2 == 0) {
      if (a > b) System.out.println("First");
      else System.out.println("Second");
    } else {
      if (b > a) System.out.println("Second");
      else System.out.println("First");
    }
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
