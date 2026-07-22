import java.io.*;
import java.util.*;

public class forked1 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  static void solve() throws Exception {
    int a = Integer.parseInt(next());
    int b = Integer.parseInt(next());
    int xk = Integer.parseInt(next());
    int yk = Integer.parseInt(next());
    int xq = Integer.parseInt(next());
    int yq = Integer.parseInt(next());
    record Pair(int x, int y) {}

    HashSet<Pair> kset = new HashSet<>();
    //king's locations where knight can reach

    kset.add(new Pair(xk + a, yk + b));
    kset.add(new Pair(xk + a, yk - b));
    kset.add(new Pair(xk - a, yk + b));
    kset.add(new Pair(xk - a, yk - b));
    kset.add(new Pair(xk + b, yk + a));
    kset.add(new Pair(xk + b, yk - a));
    kset.add(new Pair(xk - b, yk + a));
    kset.add(new Pair(xk - b, yk - a));

    HashSet<Pair> qset = new HashSet<>();
    //  queen's locations where knight can reach
    qset.add(new Pair(xq + b, yq + a));
    qset.add(new Pair(xq + b, yq - a));
    qset.add(new Pair(xq - b, yq + a));
    qset.add(new Pair(xq - b, yq - a));
    qset.add(new Pair(xq + a, yq + b));
    qset.add(new Pair(xq + a, yq - b));
    qset.add(new Pair(xq - a, yq + b));
    qset.add(new Pair(xq - a, yq - b));
    //
    int ans = 0;
    for (Pair pair : qset) {
      if (kset.contains(pair)) ans++;
      //common locations where knight can reach at both places
    }
    System.out.println(ans);
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
