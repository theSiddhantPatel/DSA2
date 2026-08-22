package dsaWithMIK.array;

public class highAlt1732 {

  public int largestAltitude(int[] gain) {
    int altitude = 0;
    int maxAlt = 0;
    int n = gain.length;
    for (int i = 0; i < n; i++) {
      altitude = altitude + gain[i];
      maxAlt = Math.max(maxAlt, altitude);
    }
    return maxAlt;
  }
}
