public class biweekly179 {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (nums[i] == 1) {
                int j = i + 1;
                while (j < n) {
                    if (nums[j] == 2) {
                        count++;
                        break;
                    }
                    j++;
                }
                if (j == n) return count == 0 ? -1 : count;
            }
            if (nums[i] == 2) {
                int j = i + 1;
                while (j < n) {
                    if (nums[j] == 1) {
                        count++;
                        break;
                    }
                    j++;
                }
                if (j == n) return count == 0 ? -1 : count;
            }

        }
        if (count == 0) return -1;
        return count;
    }

//    static void main() {
//        biweekly179 x = new biweekly179();
//        // System.out.println(x.minAbsoluteDifference(new int[]{1, 0, 0,2,0,1}));
//        System.out.println(x.minAbsoluteDifference1(new int[]{1,0,0,0,0,0,0,0,0,0,2,0}));
//
//    }

    public static void main(String[] args) {
        biweekly179 x = new biweekly179();
        System.out.println(x.minAbsoluteDifference1(
                new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0}
        ));
    }


    public int minAbsoluteDifference1(int[] nums) {
        int MinAbsDif = Integer.MAX_VALUE;
        int isLast1 = -1, isLast2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                isLast1 = i;
                if (isLast2 != -1) {
                    MinAbsDif = Math.min(MinAbsDif, Math.abs(isLast1 - isLast2));
                }
            } else if (nums[i] == 2) {
                isLast2 = i;
                if (isLast1 != -1) {
                    MinAbsDif = Math.min(MinAbsDif, Math.abs(isLast1 - isLast2));
                }
            }
        }

        return MinAbsDif == Integer.MAX_VALUE ? -1 : MinAbsDif;
    }

    public int numberOfWays(int n, int k) {
        long modulo = 1000000007;
        long[][] dp = new long[n + 1][k + 1];
        dp[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                dp[i][j] = (dp[i - 1][j - 1] + (i - 1) * dp[i - 1][j]) % modulo;
            }
        }
        long pow = PowerOfMod(2, n - k, modulo);
        return (int) ((dp[n][k] * pow) % modulo);
    }

    private long PowerOfMod(long base, int exp, long mod) {
        long ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) ans = (ans * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return ans;
    }
}
