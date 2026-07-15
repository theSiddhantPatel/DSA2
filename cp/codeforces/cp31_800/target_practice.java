import java.io.*;
import java.util.*;

public class target_practice {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    // int n = Integer.parseInt(next());

    int score = 0;

    for (int i = 0; i < 10; i++) {
      String str = next();

      for (int j = 0; j < 10; j++) {
        if (str.charAt(j) == 'X') {
          int layer = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j)); //give it a try
          score += layer + 1;
        }
      }
    }
    System.out.println(score);
    // long n = Long.parseLong(next());
    // char ch = next().charAt(0);
    // double a=Double.parseDouble(next());
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
