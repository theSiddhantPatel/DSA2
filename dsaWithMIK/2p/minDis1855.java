public class minDis1855 {
    public static int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (nums2[j] < nums1[i])
                    break;
                maxDist = Math.max(maxDist, j - i);
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
