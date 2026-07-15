public class nonZeroDigitsMultiply3756 {

  public int[] sumAndMultiply(String s, int[][] queries) {
    int[] arr = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      // String extractStr = s.charAt(queries[i][0], queries[i][1]);
      double x = Integer.parseInt(s.substring(queries[i][0], queries[i][1]));
      double ans = 0;
      double sum = 0;
      int j = 0;
      while (x > 0) {
        double rem = x % 10;
        if (rem > 0) {
          ans += rem * Math.pow(10, j);
          sum += rem;
          j++;
        }
        x /= 10;
      }
      ans *= sum;
      arr[i] = (int) ans;
    }
    return arr;
  }
}
