public class nonOverlapping1477 {

  public int minSumOfLengths(int[] arr, int target) {
    int i = 0;
    int j = 0;
    int currSum = 0;
    int n = arr.length;
    int len = 0;
    int minLen = 0;
    int res = 0;
    int[] minLenTillIdx = new int[n];
    // Arrays.fill(minLenTillIdx, Integer.MAX_VALUE);

    while (j < n) {
      currSum += arr[i];
      while (currSum > target) {
        currSum -= arr[i++];
      }
      if (currSum == target) {
        len = j - i + 1;
        if (i > 0 && minLenTillIdx[i - 1] != 0) {
          res = Math.min(res, len + minLenTillIdx[i - 1]);
        }
        minLen = Math.min(minLen, len);
      }
      minLenTillIdx[j] = minLen;
      j++;
    }
    return res == 0 ? -1 : res;
  }
}
