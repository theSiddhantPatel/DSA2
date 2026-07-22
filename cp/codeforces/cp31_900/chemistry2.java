import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class chemistry2 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    int k = Integer.parseInt(next());
    String s = next();
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    int singleValues = 0;
    for (int freq : map.values()) {
      if (freq % 2 > 0) singleValues++;
    }
    if (singleValues <= k + 1) System.out.println("YES");
    else System.out.println("NO");

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
