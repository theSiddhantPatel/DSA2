import java.io.*;
import java.util.*;

public class sequence_game12 {

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
    ArrayList<Integer> list = new ArrayList<>();
    list.add(a[0]);

    for (int i = 1; i < n; i++) {
      if (a[i] >= a[i - 1]) {
        list.add(a[i]);
      } else {
        list.add(1);
        list.add(a[i]);
      }
    }
    int b = list.size();
    System.out.println(b);
    // int[] a2 = new int[b];
    for (int i = 0; i < b; i++) {
      //   a2[i] = list.get(i);
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
    //String str = next();
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
