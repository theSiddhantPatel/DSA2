import java.util.HashSet;
import java.util.Set;

public class StringBinaryCode1461 {

  public static Set<String> binaryCodes(int k) {
    //StringBuilder sb = new StringBuilder();
    Set<String> set = new HashSet<>();
    // String s = "";
    // generateBinaryCodes(k, set, s);
    return set;
  }

  //    static void generateBinaryCodes(int k, Set<String> set, String s) {
  //        if (s.length() == k) {
  //            set.add(s);
  //            return;
  //        }
  //        generateBinaryCodes(k, set, s + '0');
  //        generateBinaryCodes(k, set, s + '1');
  //    }

  public boolean hasAllCodes(String s, int k) {
    // Set<String> set = new HashSet<>();
    // generateBinaryCodes(k, set, "");
    // you don't have t generate all codes for k=3 it is fix that all binary strings would be 2^3.
    //so if given string generates 2^3 (set size), your solution will be correct;
    Set<String> stringSet = new HashSet<>();
    int n = s.length();
    for (int i = 0; i + k <= n; i++) {
      //i+k<=n or i<=n-k  for integer limit problem
      stringSet.add(s.substring(i, i + k));
    }
    return stringSet.size() == 1 << k;
  }

  public static void main(String[] args) {
    //        Set<String> set = new HashSet<>();
    //        generateBinaryCodes(3, set, "");
    //        for (String s : set) {
    //            System.out.print(s + " ");
    //        }

    Set<String> stringSet = new HashSet<>();
    String s = "00110110";
    int j = 2;
    int n = s.length();
    for (int i = 0; i < n && j < n; i++) {
      stringSet.add(s.substring(i, j));
      j++;
    }
    for (String ss : stringSet) {
      System.out.println(ss + " ");
    }
  }
}
