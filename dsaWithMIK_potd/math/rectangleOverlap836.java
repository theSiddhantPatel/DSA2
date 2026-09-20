public class rectangleOverlap836 {

  public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    int a = rec1[0];
    int b = rec1[1];
    int c = rec1[2];
    int d = rec1[3];
    int e = rec2[0];
    int f = rec2[1];
    int g = rec2[2];
    int h = rec2[3];
    /*1. rec1 is completely left of rec2
c <= e
rec1          rec2
|------|      |------|
       c <= e
2. rec1 is completely right of rec2
a >= g
3. rec1 is completely below rec2
d <= f
4. rec1 is completely above rec2
b >= h

If any one of these is true, the rectangles do not overlap. */
    // if (c <= e || a >= g || d <= f || b >= h) return false;
    // return true;
    return !(c <= e || a >= g || d <= f || b >= h);
  }
}
