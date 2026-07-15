import java.io.*;
import java.util.*;

public class doremyPaint3_6 {

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
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(next());
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : a) {
      map.put(val, map.getOrDefault(val, 0) + 1);
    }
    if (map.size() == 1) {
      System.out.println("YES");
    } else if (map.size() > 2) {
      System.out.println("NO");
    } else {
      Iterator<Integer> it = map.values().iterator();
      int first = it.next();
      int second = it.next();
      if (Math.abs(first - second) > 1) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
    }
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
