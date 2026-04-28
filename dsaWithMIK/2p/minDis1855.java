public class minDis1855 {

    // brute force
    public static int maxDistance(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int maxDist = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = i; j < n2; j++) {
                if (nums2[j] < nums1[i])
                    break;
                maxDist = Math.max(maxDist, j - i);
            }
        }
        return maxDist;
    }

    // optimized : 2 pointer;

    public int maxDistance2(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j = 0, maxDist = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                maxDist = Math.max(maxDist, j - i);
                j++; // try to extend distance
            } else {
                i++; // move i forward to find smaller nums1[i]
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int[] nums1 = { 55, 30, 5, 4, 2 };
        int[] nums2 = { 100, 20, 10, 10, 5 };
        System.out.println(11);
        System.out.println(maxDistance(nums1, nums2));

    }

}
