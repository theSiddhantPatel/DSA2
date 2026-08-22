import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  static BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens())
      st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  public static void main(String[] args) throws Exception {
    int n = Integer.parseInt(next());
    String s = next();
    int ans = 0;
    for (int i = 1; i < n - 1; i++) {
      if (s.charAt(i) == 'x' && s.charAt(i) == 'x')
        ans++;
    }

  }
}
