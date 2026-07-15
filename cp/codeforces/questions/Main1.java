import java.util.*;

public class Main1 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while (t-- > 0) {
      int n = s.nextInt();
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < n; i++) {
        int x = s.nextInt();
        if (min > x) min = x;
        if (max < x) max = x;
      }
      System.out.println(max - min + 1);
    }
    s.close();
  }
}
