
// package cp.codeforces.cp31_800;
import java.io.*;
import java.util.*;

public class daytonaCost8 {

  static BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens())
      st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    int n = Integer.parseInt(next());
    // String str = next();
    // long n = Long.parseLong(next());
    // char ch = next().charAt(0);
    // double a=Double.parseDouble(next());
    int k = Integer.parseInt(next());
    int[] a = new int[n];
    boolean flag = true;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(next());
      if (a[i] == k)
        flag = true;
    }
    System.out.println(flag ? "YEs" : "NO");
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
