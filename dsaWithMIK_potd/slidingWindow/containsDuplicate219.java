import java.util.HashSet;

public class containsDuplicate219 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashSet<Integer> window = new HashSet<>();
    int left = 0;
    for (int right = 0; right < nums.length; right++) {
      if (right - left < k) window.add(nums[right]);
      else if (window.contains(nums[right])) return true;
      else window.remove(nums[left++]);
    }
    return false;
  }
}
