import java.util.Arrays;

public class maxProductOfThreeNums628 {

  int maxProduct = Integer.MIN_VALUE;

  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    maxProduct = nums[n - 1] * nums[n - 2] * nums[n - 3];
    return maxProduct;
  }

  public static void main(String[] args) {
    int[] arr = { -1, -2, -3, -4 };
    int[] arr2 = { 2, 3, 4, 5 };
    Arrays.sort(arr);
    for (int i : arr) {
      System.out.println(i);
    }
    for (int i : arr2) {
      System.out.println(i);
    }
  }
}
