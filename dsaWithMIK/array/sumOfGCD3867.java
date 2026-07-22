import java.util.*;

public class sumOfGCD3867 {

  public long gcdSum(int[] nums) {
    int n = nums.length;
    int[] prefixGcd = new int[n];

    // Step 1: Build prefixGcd
    int mx = nums[0];
    prefixGcd[0] = gcd(nums[0], mx);
    for (int i = 1; i < n; i++) {
      mx = Math.max(mx, nums[i]);
      prefixGcd[i] = gcd(nums[i], mx);
    }

    // Step 2: Sort prefixGcd
    Arrays.sort(prefixGcd);

    // Step 3: Pair smallest with largest
    int left = 0,
      right = n - 1;
    long ans = 0;
    while (left < right) {
      ans += gcd(prefixGcd[left], prefixGcd[right]);
      left++;
      right--;
    }

    return ans;
  }

  // Euclidean algorithm
  private int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}
