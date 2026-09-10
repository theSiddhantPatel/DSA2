public class countCommas3871 {

  public static long countCommas(long n) {
    long commas = 0;
    for (int i = 1000; i <= n; i *= 1000) {
      commas += n - i + 1;
    }
    return commas;
  }

  public static void main(String[] args) {
    System.out.println(countCommas(100_000_000));
  }
}
