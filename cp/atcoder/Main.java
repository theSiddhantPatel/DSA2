import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int m = s.nextInt();
    int[] c = new int[n];
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      c[i] = s.nextInt();
      v[i] = s.nextInt();
    }
    Arrays.sort(v);
  }
}
