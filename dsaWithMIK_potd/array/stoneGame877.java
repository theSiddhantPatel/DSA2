public class stoneGame877 {

  public boolean stoneGame(int[] piles) {
    int n = piles.length;
    int alice = 0,
      bob = 0;
    int i = 0;
    int j = n - 1;
    while (i < j) {
      if (piles[i] >= piles[j]) {
        alice += piles[i];
        i++;
      } else {
        alice += piles[j];
        j--;
      }
      if (piles[i] >= piles[j]) {
        bob += piles[i];
        i++;
      } else {
        bob += piles[j];
        j--;
      }
    }
    return alice > bob;
  }

  public static void main(String[] args) {
    stoneGame877 x = new stoneGame877();
    System.out.println(x.stoneGame(new int[] { 3, 7, 2, 3 }));
  }
}
