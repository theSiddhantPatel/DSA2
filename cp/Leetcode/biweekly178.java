import java.util.HashMap;
import java.util.Map;

public class biweekly178 {
    public static int firstUniqueEven(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                boolean flag = true;
                for (int j = 0; j < n; j++) {
                    if (i != j && nums[j] == nums[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) return nums[i];
            }
        }
        return -1;
    }

//    public static long sumOfGCDPairs(int[] nums) {
//        int max = 0;
//        for (int num : nums) max = Math.max(max, num);
//
//        int[] freq = new int[max + 1];
//        for (int val : nums) freq[val]++;
//
//        long[] count = new long[max + 1];
//        for (int d = 1; d <= max; d++) {
//            for (int mul = d; mul <= max; mul += d) {
//                count[d] += freq[mul];
//            }
//        }
//
//        long[] pairCount = new long[max + 1];
//        for (int d = max; d >= 1; d--) {
//            long pairs = count[d] * (count[d] - 1) / 2;
//            for (int mul = 2 * d; mul <= max; mul += d) {
//                pairs -= pairCount[mul];
//            }
//            pairCount[d] = pairs;
//        }
//
//        long ans = 0;
//        for (int d = 1; d <= max; d++) {
//            ans += pairCount[d] * d;
//        }
//        return ans;
//    }

    public static int minCost(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums1)
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        for (int num : nums2)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        for (int val : freq.values()) {
            if (val % 2 != 0)
                return -1;
        }
        int cost = 0;

        Map<Integer, Integer> diff = new HashMap<>();
        for (int num : nums1)
            diff.put(num, diff.getOrDefault(num, 0) + 1);
        for (int num : nums2)
            diff.put(num, diff.getOrDefault(num, 0) - 1);


        for (int val : diff.values()) {
            cost += Math.abs(val) / 2;
        }
        return cost / 2;
    }

    public static long countFancy(long l, long r) {
        for (long i = l; i <= r; i++) {
            long j=i;
            HashMap<Integer, Integer> map = new HashMap<>();
            long digitSum=0;
            long []digits=new long[10];
            while(i>0){
                long digit=i%10;
                digits[Math.toIntExact(digit)]++;
                digitSum+=digit;
                i/=10;

            }
        }
        return 0;
    }

    static void main() {
//        System.out.println(firstUniqueEven(new int[]{4}));
//        System.out.println(sumOfGCDPairs(new int[]{2, 6, 4}));
        System.out.println(minCost(new int[]{20, 20}, new int[]{10, 10}));
    }
}
