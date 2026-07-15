import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  static BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
  );
  static StringTokenizer st = new StringTokenizer("");

  static String next() throws Exception {
    while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
    return st.nextToken();
  }

  //   static void solve() throws Exception {
  //     int n = Integer.parseInt(next());
  //     // String str = next();
  //     // long n = Long.parseLong(next());
  //     //char ch = next().charAt(0);
  //     //double a=Double.parseDouble(next());
  //   }

  public static void main(String[] args) throws Exception {
    //int n = Integer.parseInt(next());
    String s = "ooxoo";
    int n = s.length();
    Deque<Integer> deque = new ArrayDeque<>();
    boolean flagRev = true;

    for (int i = 1; i <= n; i++) {
      if (flagRev) deque.addLast(i);
      else deque.addFirst(i);
      if (s.charAt(i - 1) == 'o') {
        flagRev = !flagRev;
      }
    }
    StringBuilder ans = new StringBuilder();

    if (flagRev) {
      while (!deque.isEmpty()) ans.append(deque.pollFirst()).append(' ');
    } else {
      while (!deque.isEmpty()) ans.append(deque.pollLast()).append(' ');
    }
    System.out.println(ans);
  }

  static void reverse(ArrayList<Integer> list, int l, int r) {
    while (l < r) {
      int temp = list.get(l);
      list.set(l, list.get(r));
      list.set(r, temp);
      l++;
      r--;
    }
  }
}
