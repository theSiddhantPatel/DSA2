import java.util.HashSet;

public class longestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        for (int val : set) {
            if (!set.contains(val - 1)) {
                int curr = 1;
                int temp = val;
                while (set.contains(++temp))
                    curr++;
                ans = Math.max(ans, curr);
            }
        }
        return ans;
    }

    static void main() {
        longestConsecutiveSequence x = new longestConsecutiveSequence();
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(x.longestConsecutive(arr));
    }
}
