import java.util.*;

public class distinceSubsequences940 {

  public static int distinctSubseqII(String s) {
    Set<String> set = new HashSet<>();
    StringBuilder sb = new StringBuilder();
    solve(s, sb, set, 0);
    return set.size() - 1;
  }

  static void solve(String s, StringBuilder sb, Set<String> set, int i) {
    if (i == s.length()) {
      set.add(sb.toString());
      //   System.out.println(sb.toString());
      return;
    }
    //make a choice and recurese,
    solve(s, sb.append(s.charAt(i)), set, i + 1);
    sb.deleteCharAt(sb.length() - 1);
    solve(s, sb, set, i + 1);
  }

  //optimized approach : using DP
  public int distinctSubseqII2(String s) {
    final int MOD = 1_000_000_007;

    long[] dp = new long[26];
    long total = 0;
    //remember:
    // dp[c] = number of distinct subsequences ending with character c
    //total = total number of distinct non-empty subsequences
    for (char c : s.toCharArray()) {
      int index = c - 'a';

      long oldValue = dp[index];
      long newValue = (total + 1) % MOD;

      total = (total - oldValue + newValue + MOD) % MOD;

      dp[index] = newValue;
    }

    return (int) total;
  }

  public static void main(String[] args) {
    System.out.println(distinctSubseqII("abcada"));
  }
}
