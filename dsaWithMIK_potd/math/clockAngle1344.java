package dsaWithMIK.math;

public class clockAngle1344 {

  public double angleClock(int hour, int minutes) {
    double hourAngle = (hour % 12) * 30 + minutes * 0.5;
    //here .5 is deviation of hour hand in 60 minutes, as hour hand moves 30 degree in 60 minutes,
    //  so in 1 minute it moves 0.5 degree.
    double minuteAngle = (minutes * 6);
    //Clock angle problems always ask for the smaller angle.
    double diff = Math.abs(hourAngle - minuteAngle);
    return Math.min(diff, 360 - diff);
  }
}
