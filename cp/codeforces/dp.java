public class dp {
    public static int fib(int n) {
        int[] dp = new int[n + 1];
        fib(n, dp);
        return dp[n];
    }

    static int fib(int n, int[] dp) {
        if (n == 0 || n == 1) return n;
        if (dp[n] == 0) return dp[n] = (fib(n - 1, dp) + fib(n - 2, dp));
        return dp[n];
    }

    static void main() {
        System.out.println(fib(10));
    }
}
