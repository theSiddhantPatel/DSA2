import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueBinaryStr1980 {

  public String findDifferentBinaryString(String[] nums) {
    int k = nums[0].length();
    Set<String> set = new HashSet<>();
    // int n = nums.length;

    Set<String> set2 = new HashSet<>(Arrays.asList(nums));

    generateBinaryCodes(k, "", set);
    for (String str : set) {
      if (!set2.contains(str)) return str;
    }
    return "";
  }

  public String findDifferentBinaryString2(String[] nums) {
    String s = "";
    for (int i = 0; i < nums.length; i++) {
      // sb.append(nums[i].charAt(i) == '0' ? '1' : '0');//bcz n contains only n strings each of length n , so you can flip all n bits and return that string simply
      s = s + (nums[i].charAt(i) == '0' ? '1' : '0');
    }
    // return sb.toString();
    return s;
  }

  public void generateBinaryCodes(int k, String s, Set<String> set) {
    if (s.length() == k) {
      set.add(s);
      return;
    }
    generateBinaryCodes(k, s + "0", set);
    generateBinaryCodes(k, s + "1", set);
  }

  static void main() {
    UniqueBinaryStr1980 x = new UniqueBinaryStr1980();
    //        Set<String> set = new HashSet<>();
    //        x.generateBinaryCodes(3, "", set);
    //        for (String str : set) {
    //            System.out.print(str + " ");
    //        }
    System.out.println(
      x.findDifferentBinaryString2(new String[] { "10", "01" })
    );
  }
}
