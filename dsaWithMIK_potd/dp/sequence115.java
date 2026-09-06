import java.util.Arrays;

public class sequence115 {

  //brute force
  public int numDistinct(String s, String t) {
    return solve(s, t, 0, 0);
  }

  public int solve(String s, String t, int i, int j) {
    if (j == t.length()) return 1;
    if (i == s.length()) return 0;

    if (s.charAt(i) == t.charAt(j)) {
      int take = solve(s, t, i + 1, j + 1);
      int skip = solve(s, t, i + 1, j);
      return take + skip;
    } else {
      return solve(s, t, i + 1, j);
    }
  }

  // optimization : using dp
  public int numDistinct2(String s, String t) {
    int[][] dp = new int[s.length() + 1][t.length() + 1];

    //since 0 can also be an answer , so initialize all values -1;
    for (int i = 0; i < s.length(); i++) {
      Arrays.fill(dp[i], -1);
    }
    return solve2(s, t, 0, 0, dp);
  }

  public int solve2(String s, String t, int i, int j, int[][] dp) {
    if (j == t.length()) return 1;
    if (i == s.length()) return 0;
    if (dp[i][j] != -1) return dp[i][j];

    int ans = 0;
    if (s.charAt(i) == t.charAt(j)) {
      int take = solve2(s, t, i + 1, j + 1, dp);
      int skip = solve2(s, t, i + 1, j, dp);
      dp[i][j] = take + skip;
    } else {
      dp[i][j] = solve2(s, t, i + 1, j, dp);
    }
    return dp[i][j];
  }
}
