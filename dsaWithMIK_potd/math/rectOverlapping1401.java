public class rectOverlapping1401 {

  public boolean checkOverlap(
    int radius,
    int xCenter,
    int yCenter,
    int x1,
    int y1,
    int x2,
    int y2
  ) {
    int xi, yi;
    // if rect is right side
    if (x1 > xCenter) xi = x1;
    // if rect is right side
    else if (x2 < xCenter) xi = x2;
    else xi = xCenter;
    if (y1 > yCenter) yi = y1;
    else if (y2 < yCenter) yi = y2;
    else yi = yCenter;
    int dist = (int) Math.sqrt(
      Math.pow((xi - xCenter), 2) + Math.pow((yi - yCenter), 2)
    );
    return dist <= radius;
  }
}
