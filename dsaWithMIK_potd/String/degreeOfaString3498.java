public class degreeOfaString3498 {

  public int reverseDegree(String s) {
    int ans = 0;
    int i = 1;
    for (char ch : s.toCharArray()) {
      ans += (1 + 'z' - ch) * i++;
    }
    return ans;
  }
}
