import java.io.*;
import java.util.*;

public class desorting16 {

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
    int diff = Integer.MAX_VALUE;
    boolean flag = false;
    for (int i = 0; i < n - 1; i++) {
      if (a[i] > a[i + 1]) {
        System.out.println(0);
        flag = true;
        break;
      }
      //   diff = Math.min(Math.abs(a[i] - a[i + 1]), diff);
      //you above checked that array is sorted so you can write it with math.abs
      diff = Math.min(a[i + 1] - a[i], diff);
    }
    if (flag == false) {
      System.out.println(diff == 0 ? 1 : diff / 2 + 1);
    }
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
