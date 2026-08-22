import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class missingElements3731 {

  public static List<Integer> findMissingElements(int[] nums) {
    Arrays.sort(nums);
    List<Integer> list = new ArrayList<>();
    int n = nums.length;
    int j = 0;
    for (int i = 0; i < n - 1; i++, j++) {
      int curr = nums[i];
      while (nums[i + 1] > nums[i] + 1) {
        list.add(++curr);
      }
    }
    Collections.sort(list);
    return list;
  }

  public static void main(String[] args) {
    findMissingElements(new int[] { 1, 5 });
  }
}
