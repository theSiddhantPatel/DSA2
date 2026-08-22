import java.util.ArrayList;

public class distributionElements3069 {

  public int[] resultArray(int[] nums) {
    ArrayList<Integer> list1 = new ArrayList<>(nums[0]);
    ArrayList<Integer> list2 = new ArrayList<>(nums[1]);

    for (int i = 0; i < nums.length; i++) {
      if (list1.get(list1.size() - 1) > list2.get(list2.size() - 1)) {
        list1.add(nums[i]);
      } else list2.add(nums[i]);
    }
    for (int i = 0; i < list1.size(); i++) {
      nums[i] = list1.get(i);
    }
    for (int i = 0; i < list2.size(); i++) {
      nums[i] = list1.get(i);
    }
    return nums;
  }
}
