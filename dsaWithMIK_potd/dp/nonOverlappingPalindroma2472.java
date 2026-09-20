import java.util.Arrays;

public class nonOverlappingPalindroma2472 {

  //   public static int maxPalindromes(String s, int k) {
  //     int n = s.length();
  //     int count = 0;
  //     for (int i = 0; i < n; i++) {
  //       String str = "";
  //       for (int j = i; j < n; j++) {
  //         str = str + s.charAt(j);
  //         if (isPalindrome2(str) && str.length() >= k) {
  //           count++;
  //           i = j;
  //           break;
  //         }
  //       }
  //     }
  //     return count;
  //   }

  public static boolean isPalindrome(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i++) != s.charAt(j--)) return false;
    }
    return true;
  }

  public int solve(String s, int k, int i, int j, int[][] t) {
    int n = s.length();
    if (i >= n || j >= n) return 0;

    if (t[i][j] != -1) return t[i][j];

    if (isPalindrome(s, i, j)) {
      int growWindow = solve(s, k, i, j + 1, t);
      int takeIt = 1 + solve(s, k, j + 1, j + k, t);
      int slideWindow = solve(s, k, i + 1, j + 1, t);

      return t[i][j] = Math.max(growWindow, Math.max(takeIt, slideWindow));
    }

    int slideWindow = solve(s, k, i + 1, j + 1, t);
    int growWindow = solve(s, k, i, j + 1, t);

    return t[i][j] = Math.max(slideWindow, growWindow);
  }

  public int maxPalindromes2(String s, int k) {
    int n = s.length();
    if (k == 1) return n;
    int[][] dp = new int[n][n];
    for (int[] row : dp) Arrays.fill(row, -1);
    return solve(s, k, 0, k - 1, dp);
  }

  public static void main(String[] args) {
    nonOverlappingPalindroma2472 x = new nonOverlappingPalindroma2472();
    System.out.println(x.maxPalindromes2("bbbbbb", 3));
  }
}
