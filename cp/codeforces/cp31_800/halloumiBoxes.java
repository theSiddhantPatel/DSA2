// package cp.codeforces.cp31;

import java.io.*;
import java.util.*;

public class halloumiBoxes {

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
    int k = Integer.parseInt(next());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(next());
    }
    boolean flag = false,
      flag2 = true;
    if (n == 1) {
      System.out.println("Yes");
      flag = true;
    } else if (k >= 2 && !flag) {
      System.out.println("Yes");
      flag = true;
    }
    for (int i = 0; i < n - 1; i++) {
      if (a[i] > a[i + 1]) {
        flag2 = false;
        break;
      }
    }
    if (flag2 && !flag) System.out.println("yes");
    if (flag == false && flag2 == false) System.out.println("NO"); // String str = next();
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
