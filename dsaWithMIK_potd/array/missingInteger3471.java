public class missingInteger3471 {

  public int largestInteger(int[] nums, int k) {
    int n = nums.length;
    int max = 0;
    for (int i : nums) {
      max = Math.max(i, max);
    }
    if (n == k) return max;

    // Case 2: k == 1 → need largest element that occurs exactly once
    if (k == 1) {
      int ans = -1;
      for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
          if (nums[i] == nums[j]) count++;
        }
        if (count == 1) ans = Math.max(ans, nums[i]);
      }
      return ans;
    }

    // Case 3: 1 < k < n → only nums[0] and nums[n-1] can be almost missing
    int countFirst = 0,
      countLast = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] == nums[0]) countFirst++;
      if (nums[i] == nums[n - 1]) countLast++;
    }

    boolean firstValid = (countFirst == 1);
    boolean lastValid = (countLast == 1);

    if (firstValid && lastValid) return Math.max(nums[0], nums[n - 1]);
    if (firstValid) return nums[0];
    if (lastValid) return nums[n - 1];
    return -1;
  }
}
