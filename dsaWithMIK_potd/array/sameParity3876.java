import java.util.Arrays;

public class sameParity3876 {

  public boolean uniformArray(int[] nums1) {
    Arrays.sort(nums1);
    if (nums1[0] == 1) return true; //now u can change any element's parity
    boolean same = true;
    int j = 0;
    for (int i = 1; i < nums1.length; i++) {
      if (nums1[i] % 2 != nums1[0] % 2) {
        same = false;
        j = i;
        break;
      }
    }
    if (same) return same; //if all elements have same parity return true;
    int parity = nums1[j] % 2;
    if (
      (nums1[j] - nums1[0]) % 2 != parity ||
      (nums1[j] - nums1[j - 1]) % 2 != parity
    ) return true;

    return false;
  }
}
