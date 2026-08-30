public class minimumRemoval2091 {
    public int minimumDeletions(int[] nums) {
        int minPos = 0;
        int maxPos = 0;
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minPos = i;
            }
            if (max < nums[i]) {
                max = nums[i];
                maxPos = i;
            }
        }
        int left = Math.max(minPos, maxPos) + 1;// both valuse belong to left side
        int right = n - Math.min(minPos, maxPos); // both values belong to right side
        int mixed = Math.min(minPos + 1 + n - maxPos, maxPos + 1 + n - minPos); // one left side and one right side
        return Math.min(left, Math.min(right, mixed));
    }
}
