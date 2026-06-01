package dsaWithMIK.array;

import java.util.Arrays;

public class minCost2126 {

  public int minimumCost(int[] cost) {
    Arrays.sort(cost);
    int n = cost.length;
    int j = 1;
    int minCost = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (j % 3 != 0) {
        minCost += cost[i];
      }
      j++;
    }
    return minCost;
  }
}
