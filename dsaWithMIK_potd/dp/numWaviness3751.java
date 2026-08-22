package dsaWithMIK.dp;

public class numWaviness3751 {

  public static int totalWaviness(int num1, int num2) {
    int score = 0;
    for (int i = num1; i <= num2; i++) {
      String num = Integer.toString(i);
      for (int j = 1; j < num.length() - 1; j++) {
        if (
          num.charAt(j) > num.charAt(j - 1) && num.charAt(j) > num.charAt(j + 1)
        ) {
          score++;
        } else if (
          num.charAt(j) < num.charAt(j - 1) && num.charAt(j) < num.charAt(j + 1)
        ) {
          score++;
        }
      }
    }
    return score;
  }

  public static void main(String[] args) {
    System.out.println(totalWaviness(198, 202));
  }
}
