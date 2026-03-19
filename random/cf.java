import java.util.*;

public class cf {
    static int MOD = 1000000007;
    static int N = 101;
    static long[][] DP = new long[N][N];
    static long[] a;
    static int n;

    // Recursive DP function
    static long dp(int i, int wat) {
        if (i == n) return 0;
        if (DP[i][wat] != -1) return DP[i][wat];

        long ans = 0;
        if (wat > 0) {
            ans = Math.max(ans, 2 * a[i] + dp(i + 1, wat - 1));
        }
        ans = Math.max(ans, a[i] + dp(i + 1, wat));
        ans = Math.max(ans, dp(i + 1, wat + 1));

        return DP[i][wat] = ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            n = sc.nextInt();
            a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Reset DP table
            for (int i = 0; i <= n; i++) {
                Arrays.fill(DP[i], -1);
            }
            System.out.println(dp(0, 0));
        }
    }
}
