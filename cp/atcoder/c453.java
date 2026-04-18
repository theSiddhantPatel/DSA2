// package cp.atcoder;

import java.util.Scanner;

public class c453 {

  // Remove leading 'o' characters from a string

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    String str = s.next();

    int i = 0;
    while (i < n && str.charAt(i) == 'o') {
      i++;
    }

    String result = str.substring(i);
    System.out.println(result);

    s.close();
  }
}
