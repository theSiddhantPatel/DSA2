import java.util.*;

public class minimum_push_to_type_word3016 {

  public int minimumPushes(String word) {
    int[] arr = new int[26];

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      arr[ch - 'a']++;
    }

    /*compact version
Arrays.sort(arr);
int ans = 0;

for (int i = 25; i >= 0; i--) {
    if (arr[i] == 0) break;
    ans += ((25 - i) / 8 + 1) * arr[i];
} */
    Arrays.sort(arr);
    int j = 0;
    int k = arr.length - 1;
    while (j < k) {
      int temp = arr[j];
      arr[j] = arr[k];
      arr[k] = temp;
      j++;
      k--;
    }
    int ans = 0;
    int i = 0;
    while (i < 8 && arr[i] > 0) {
      ans += arr[i];
      i++;
    }
    while (i < 16 && arr[i] > 0) {
      ans += 2 * arr[i];
      i++;
    }
    while (i < 24 && arr[i] > 0) {
      ans += 3 * arr[i];
      i++;
    }
    while (i < 26 && arr[i] > 0) {
      ans += 4 * arr[i];
      i++;
    }

    return ans;
  }

  public static void main(String[] args) {
    minimum_push_to_type_word3016 x = new minimum_push_to_type_word3016();
    System.out.println(x.minimumPushes("aabbccddeeffgghhiiiiii"));
  }
}
