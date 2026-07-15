package dsaWithMIK.array;

public class majorityElement1_3737 {

  public int countMajoritySubarrays(int[] nums, int target) {
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = i; j < nums.length; j++) {
        count += nums[j] == target ? 1 : 0;
        if (count > (j - i + 1) / 2) ans++;
      }
    }
    return ans;
  }
}
