import java.util.Arrays;

public class smallest_palindromic_rearrangement3517 {

  public String smallestPalindrome(String s) {
    int n = s.length();
    String firstHalf = s.substring(0, n / 2);
    char[] ch = firstHalf.toCharArray();
    Arrays.sort(ch);

    StringBuilder sb = new StringBuilder();
    for (char c : ch) {
      sb.append(c);
    }
    System.out.println(sb.toString());
    if (n % 2 == 1) sb.append(s.charAt(n / 2));

    System.out.println(sb.toString());
    int len = ch.length;
    for (int i = len - 1; i >= 0; i--) {
      sb.append(ch[i]);
      System.out.println(sb.toString());
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    smallest_palindromic_rearrangement3517 x =
      new smallest_palindromic_rearrangement3517();
    System.out.println(x.smallestPalindrome("acdcda"));
  }
}
