import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  //   static void solve() throws Exception {
  //     int n = Integer.parseInt(next());
  //     // String str = next();
  //     // long n = Long.parseLong(next());
  //     //char ch = next().charAt(0);
  //     //double a=Double.parseDouble(next());
  //   }

  public static void main(String[] args) throws Exception {
    int n = Integer.parseInt(next());
    String s = next();
    String t = next();
    boolean flag = true;
    for (int i = 0; i < n; i++) {
      if (t.charAt(i) == '*') {
      } else if (t.charAt(i) != s.charAt(i)) {
        flag = false;
        break;
      }
    }
    if (flag) System.out.println("Yes");
    else System.out.println("No");
  }
}
