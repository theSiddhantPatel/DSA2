import java.util.HashMap;
import java.util.Map;

public class lc746 {
    static void main() {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        boolean flag = false;
//        for (int i = 2; i * i < n; i++) {
//            if (n % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//        System.out.println(flag ? "NO" : "Yes");


//        String[] words = {"abcd", "def", "xyz"};
//        int[] weights = {5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2};
//        System.out.println(mapWordWeights(words, weights));

        String[] words = {"apple", "apply", "banana", "bandit"};
        int k = 2;
        System.out.println(prefixConnected(words, k));
    }

    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int sum = 0;
            for (int j = 0; j < words[i].length(); j++) {
                sum += weights[words[i].charAt(j) - 'a'];
            }
            sum = sum % 26;
            System.out.println(sum);
            sb.append((char) (122 - sum));
        }
        return sb.toString();
    }

    public static int prefixConnected(String[] words, int k) {
        int n=words.length;
        Map<String, Integer> prefCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (words[i].length() < k)
                continue;
            String pref = words[i].substring(0, k);
            prefCount.put(pref, prefCount.getOrDefault(pref, 0) + 1);
        }
        int res = 0;
        for (int count : prefCount.values()) {
            if (count > 1) res++;
        }
        return res;
    }
}