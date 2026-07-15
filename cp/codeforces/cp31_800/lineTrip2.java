// package cp.codeforces.cp31;

import java.io.*;
import java.util.*;

public class lineTrip2 {

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
    // String str = next();
    // long n = Long.parseLong(next());
    //char ch = next().charAt(0);
    //double a=Double.parseDouble(next());
    int x = Integer.parseInt(next());
    int[] dist = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      dist[i] = Integer.parseInt(next());
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      max = Math.max(max, Math.abs(dist[i] - dist[i + 1]));
    }
    max = Math.max(max, 2 * (Math.abs(dist[n] - x)));

    System.out.println(max);
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
