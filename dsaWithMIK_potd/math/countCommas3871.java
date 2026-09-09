public class countCommas3871 {

  public long countCommas(long n) {
    long commas = 0;
    for (int i = 0; i <= n; i *= 1000) {
      commas += n - i + 1;
    }
    return commas;
  }
}
