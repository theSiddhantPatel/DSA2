public class divisible3345 {

  public int smallestNumber(int n, int t) {
    for (int i = n; i < 10; i++) {
      if (productOfDigits(i) % t == 0) {
        return i;
      }
    }
    return 0;
  }

  private int productOfDigits(int n) {
    int productSum = 1;
    while (n > 0) {
      productSum *= n % 10;
      if (productSum == 0) return 0;
      n /= 10;
    }
    return productSum;
  }

  public static void main(String[] args) {
    divisible3345 x = new divisible3345();
    System.out.println(x.smallestNumber(10, 2));
  }
}
