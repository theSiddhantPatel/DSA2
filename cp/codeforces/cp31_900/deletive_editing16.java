import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class deletive_editing16 {

  static BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens())
      st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static int ni() throws Exception {
    return Integer.parseInt(next());
  }

  static long nl() throws Exception {
    return Long.parseLong(next());
  }

  static void solve() throws Exception {
    String s = next();
    String t = next();

    int[] freq = new int[26];

    for (int k = 0; k < t.length(); k++) {
      freq[t.charAt(k) - 'A']++;
    }

    int i = s.length() - 1;
    int j = t.length() - 1;

    while (i >= 0) {
      if (j >= 0 && s.charAt(i) == t.charAt(j)) {
        freq[s.charAt(i) - 'A']--;
        i--;
        j--;
      } else {
        if (freq[s.charAt(i) - 'A'] > 0) {
          System.out.println("NO");
          return;
        }
        i--;
      }
    }

    if (j == -1)
      System.out.println("YES");
    else
      System.out.println("NO");
  }

  public static void main(String[] args) throws Exception {
    int t = ni();
    while (t-- > 0) {
      solve();
    }
  }
}
