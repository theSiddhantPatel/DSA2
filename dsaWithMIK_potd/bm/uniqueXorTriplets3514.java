import java.util.*;

public class uniqueXorTriplets3514 {

  public int uniqueXorTriplets(int[] nums) {
    int n = nums.length;
    Set<Integer> pairXor = new HashSet<>();
    pairXor.add(0);

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        pairXor.add(nums[i] ^ nums[j]);
        if (pairXor.size() == 2048) break;
        //tle removed - no need to calculate for repeating numbers ,
        //bcz if n<=1500, xor size can be upto 2048(2,pow(no. of bits(1500))),
        // (2,pow 11) and no more values remaining.
      }
      if (pairXor.size() == 2048) break;
    }

    Set<Integer> tripletXor = new HashSet<>();
    for (int pair : pairXor) {
      for (int num : nums) {
        tripletXor.add(pair ^ num);
      }
    }
    return tripletXor.size();
  }

  public static void main(String[] args) {
    uniqueXorTriplets3514 u = new uniqueXorTriplets3514();
    System.out.println(u.uniqueXorTriplets(new int[] { 6, 7, 8, 9 }));
  }
}
