import java.io.*;
import java.util.*;

public class ambitious_kid11 {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  public static void main(String[] args) throws Exception {
    int n = Integer.parseInt(next());
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(next());
    }

    int ans = 1000000;

    for (int i = 0; i < n; i++) {
      ans = Math.min((int) Math.abs(a[i]), ans);
    }
    System.out.println(ans);

    // long n = Long.parseLong(next());
    //char ch = next().charAt(0);
    //double a=Double.parseDouble(next());
  }
}
