package dsaWithMIK.String;

public class maxBalloons1189 {

  public int maxNumberOfBalloons(String text) {
    int[] arr = new int[5];
    for (char c : text.toCharArray()) {
      switch (c) {
        case 'b' -> arr[0]++;
        case 'a' -> arr[1]++;
        case 'l' -> arr[2]++;
        case 'o' -> arr[3]++;
        case 'n' -> arr[4]++;
        default -> {
        }
      }
    }
    arr[2] /= 2;
    arr[3] /= 2;
    int ans = 1000;
    for (int x : arr) {
      ans = Math.min(ans, x);
    }
    return ans;
  }
}
