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
    int a = Integer.parseInt(next());
    int b = Integer.parseInt(next());
    System.out.println(3 * a > 2 * b ? "Yes" : "No");
  }
}
