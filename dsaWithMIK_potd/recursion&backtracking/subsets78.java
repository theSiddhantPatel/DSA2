import java.util.ArrayList;
import java.util.List;

class subsets78 {

  public static List<List<Integer>> subsets(int[] nums) {
    int idx = 0;
    // String ans = "";
    List<List<Integer>> ls = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    solve(nums, idx, ls, current);
    return ls;
  }

  static void solve(
    int[] nums,
    int idx,
    List<List<Integer>> ls,
    List<Integer> current
  ) {
    if (idx == nums.length) {
      ls.add(new ArrayList<>(current));
      return;
    }
    current.add(nums[idx]);
    solve(nums, idx + 1, ls, current);

    current.remove(current.size() - 1);
    solve(nums, idx + 1, ls, current);
  }

  static void main(String[] args) {
    System.out.println(subsets(new int[] { 1, 2, 3 }));
  }
}
