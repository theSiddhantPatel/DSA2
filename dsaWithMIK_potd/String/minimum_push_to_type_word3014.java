public class minimum_push_to_type_word3014 {

  public int minimumPushes(String word) {
    int n = word.length();
    if (n <= 8) return n;
    else if (n <= 16) return 8 + (n - 8) * 2;
    else if (n <= 24) return 24 + (n - 16) * 3;
    else return 8 + (n - 8) * 2 + (n - 16) * 3 + (n - 24) * 4;
  }

  public static void main(String[] args) {
    minimum_push_to_type_word3014 x = new minimum_push_to_type_word3014();
    System.out.println(x.minimumPushes("acolkxjbizfmhnrdq"));
  }
}
