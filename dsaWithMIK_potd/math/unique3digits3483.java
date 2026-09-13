import java.util.HashSet;

public class unique3digits3483 {

  public static int totalNumbers(int[] digits) {
    int n = digits.length;
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n && j != i; j++) {
        for (int k = 0; k < n && (k != i && k != j); k++) {
          int num1 = digits[i] * 100 + digits[j] * 10 + digits[k];
          int num2 = digits[i] * 100 + digits[k] * 10 + digits[j];
          int num5 = digits[j] * 100 + digits[i] * 10 + digits[k];
          int num6 = digits[j] * 100 + digits[k] * 10 + digits[i];
          int num3 = digits[k] * 100 + digits[i] * 10 + digits[j];
          int num4 = digits[k] * 100 + digits[j] * 10 + digits[i];
          if (num1 % 2 == 0 && num1 > 99) set.add(num1);
          if (num2 % 2 == 0 && num2 > 99) set.add(num2);
          if (num3 % 2 == 0 && num3 > 99) set.add(num3);
          if (num4 % 2 == 0 && num4 > 99) set.add(num4);
          if (num5 % 2 == 0 && num5 > 99) set.add(num5);
          if (num6 % 2 == 0 && num6 > 99) set.add(num6);
        }
      }
    }
    return set.size();
  }

  public static void main(String[] args) {
    int[] arr = { 1, 3, 5 };
    System.out.println(totalNumbers(arr));
  }
}
