public class uniqueXorTriplets3513 {

  int uniqueXorTriplets(int[] nums) {
    int n = nums.length;
    if (n == 1 || n == 2) return n;
    return (int) Math.pow(2, totalBits2(n, 0));
  }

  private int totalBits(int n) {
    int i = 0;
    while (n > 0) {
      // n = n - (int) Math.pow(2, i++);
      n = n / 2;
      i++;
    }
    return i;
  }

  //recursive approach
  int totalBits2(int n, int i) {
    if (n <= 0) return i;
    return totalBits2(n / 2, i + 1);
  }

  public static void main(String[] args) {
    uniqueXorTriplets3513 u = new uniqueXorTriplets3513();
    System.out.println(u.totalBits2(4, 0));
    System.out.println(u.totalBits(4));
    System.out.println(u.uniqueXorTriplets(new int[] { 1, 2, 3, 4 }));
  }
}
