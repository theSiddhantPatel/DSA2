package dsaWithMIK.array;

import java.util.Arrays;

public class Destroying_Asteroids2126 {

  public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
    Arrays.sort(asteroids);
    int i = 0;
    int n = asteroids.length;

    while (i < n && mass > asteroids[i]) {
      mass += asteroids[i];

      //if we don't want to use 'long data type ' then
      // overflow check
      if (mass > Integer.MAX_VALUE - asteroids[i]) {
        return true;
      }
      i++;
    }
    System.out.println(i);
    return i == n;
  }

  public static void main(String[] args) {
    boolean ans = (asteroidsDestroyed(10, new int[] { 3, 9, 19, 5, 21 }));
    System.out.println(ans);
  }
}
