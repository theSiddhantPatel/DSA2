import java.util.ArrayList;

public class active_sections3499 {

  public int maxActiveSectionsAfterTrade(String s) {
    int n = s.length();
    ArrayList<Integer> list = new ArrayList<>();
    int zeros = 0;
    int ones = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '0') {
        zeros++;
        if (ones > 0) {
          list.add(ones);
          ones = 0;
        }
      } else {
        ones++;
        if (zeros > 0) {
          list.add(zeros);
          zeros = 0;
        }
      }
    }

    int sections = 0;

    for (int i = 2; i < list.size(); i++) {
      sections = Math.max(
        list.get(i - 2) + list.get(i) + list.get(i),
        sections
      );
    }
    return sections + ones;
  }

  public static void main(String[] args) {
    active_sections3499 a = new active_sections3499();
    int x = a.maxActiveSectionsAfterTrade("1000100");
    System.out.println(x);
  }
}
