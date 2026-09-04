public class stableIndex3903 {

  public int firstStableIndex(int[] nums, int k) {
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      int max = 0,
        min = 0;
      for (int j = 0; j <= i; j++) {
        max = Math.max(max, nums[j]);
      }

      for (int j = i; j < n; j++) {
        min = Math.min(min, nums[j]);
      }
      int temp = max - min;

      if (temp <= k) return i;
      //you have to return ths smallest index , so if you found just return it.
    }
    return -1;
  }
}
