import java.io.*;
import java.util.*;

public class united_we_stand13 {

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
    Arrays.sort(a);
    if (a[0] == a[n - 1]) System.out.println(-1);
    else {
      ArrayList<Integer> b = new ArrayList<>();
      b.add(a[0]);
      ArrayList<Integer> c = new ArrayList<>();
      for (int i = 1; i < n; i++) {
        if (a[i] == a[0]) b.add(a[i]);
        else c.add(a[i]);
      }

      if (b.isEmpty() || c.isEmpty()) System.out.println(-1);
      else {
        System.out.println(b.size() + " " + c.size());
        for (int i = 0; i < b.size(); i++) {
          System.out.print(b.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < c.size(); i++) {
          System.out.print(c.get(i) + " ");
        }
        System.out.println();
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
