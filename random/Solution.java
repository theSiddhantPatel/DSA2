
import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        char nextChar() {
            return next().charAt(0);
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static long maximumScore(int[] nums) {
        int n = nums.length;
        int[] suffMin = new int[n];
        suffMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffMin[i] = Math.min(nums[i], suffMin[i + 1]);
        }
        long max = Integer.MIN_VALUE;
        long prefSum = 0;
        for (int i = 0; i < n - 1; i++) {
            prefSum += nums[i];
            long score = prefSum - suffMin[i + 1];
            max = Math.max(max, score);
        }
        return max;
    }

    public static long minCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if (costBoth >= cost1 + cost2) {
            return (long) need1 * cost1 + (long) need2 * cost2;
        }
        int both = Math.min(need1, need2);
        long totalCost = (long) both * costBoth;
        totalCost += (long) (need1 - both) * cost1;
        totalCost += (long) (need2 - both) * cost2;

        return totalCost;
    }

    public static int minAllOneMultiple(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        Double n = 1D;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        while (n % k != 0) {
            sb.append('1');
            n = n * 10 + 1;
        }
        return sb.length();
    }

    public static boolean isNumber(String s) {
        boolean seen_dot = false;
        boolean seen_digit = false;
        boolean seen_exponent = false;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                seen_digit = true;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (i != 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')) {
                    return false;
                }
                seen_digit = false;
            } else if (s.charAt(i) == '.') {
                if (seen_dot || seen_exponent) return false;
                seen_dot = true;
            } else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (seen_exponent || !seen_digit) return false;
                seen_exponent = true;
                seen_digit = false;
            } else return false;
        }
        if (!seen_digit) return false;
        return true;
    }


    public int minLength(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        int i = 0;
        int target = Integer.MAX_VALUE;
        int distinctSum = 0;
        for (int j = 0; j < n; j++) {
            freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            if (freq.get(nums[j]) == 1) {
                distinctSum += nums[j];
            }
            while (distinctSum >= k) {
                target = Math.min(target, j - i + 1);

                freq.put(nums[i], freq.get(nums[i]) - 1);
                if (freq.get(nums[i]) == 0) {
                    distinctSum -= nums[i];
                }
                i++;
            }
        }
        if (target == Integer.MAX_VALUE) return -1;
        return target;
    }


    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < 3; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int i = 0, j = 3, count = 0;
        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            char c = s.charAt(i);
            if (map.get(c) == 1) {
                map.remove(c);
            } else {
                map.put(c, map.get(c) - 1);
            }
            if (map.size() == 3) count++;
            i++;
            j++;
        }
        return count;
    }

    public int longestBalanced(String s) {
        int n = s.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                if (freqCheck(freq)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    public boolean freqCheck(int[] arr) {
        int common = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            else if (common == 0) {
                common = arr[i];
            } else if (common != arr[i]) return false;
        }
        return true;
    }

    static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.longestBalanced("aabcffff"));
    }


}




