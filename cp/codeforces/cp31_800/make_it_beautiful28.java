import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class make_it_beautiful28 {

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
    boolean allEqual = true;
    for (int i = 1; i < n; i++) {
      if (a[i] != a[0]) {
        allEqual = false;
        break;
      }
    }
    if (allEqual) {
      System.out.println("NO");
      return;
    }

    int i = 0,
      j = a.length - 1;
    while (i < j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }
    if (a[0] == a[1]) {
      int temp = a[n - 1];
      a[n - 1] = a[1];
      a[1] = temp;
    }

    System.out.println("YES");
    for (int x : a) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(next());
    while (t-- > 0) {
      solve();
    }
  }
}
