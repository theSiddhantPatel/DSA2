import java.util.Arrays;
//recursion part 1 gfg by raghav sir playlist
public class basics {
    //question 1:
    //print 1 to n with using single parameter in recursion function
    static int n;

    public static void print(int i) {
        if (i == n) return;
        System.out.print(i + " ");
        print(i += 1);
    }

    static int reverseNum(int n, int rev) {
        if (n == 0) return rev;
        return reverseNum(n / 10, (rev * 10 + (n % 10)));
    }

    static int powOfNum(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        if (b % 2 == 0) return powOfNum(a, b / 2) * powOfNum(a, b / 2);
        else return a * powOfNum(a, b / 2) * powOfNum(a, b / 2);
    }

    static int sumOfNaturalNums(int n) {
        // return (n*(n+1))/2;  //O(1) mathematical
        if (n == 1) return 1;
        return n + sumOfNaturalNums(n - 1);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b, int i, int res) {
        //return a*b/gcd(a,b);
        if (a == 1 || b == 1) return res * a * b;
        if (i > a && i > b) return res * a * b;
        if (a % i == 0 && b % i == 0) return lcm(a / i, b / i, i + 1, res * i);
        else return lcm(a, b, i + 1, res);
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void fibonacci_with_dp(int n) {
        if (n == 0 || n == 1)
            //return n;
            System.out.println(n);
        long[] dp = new long[n + 1];
        // Arrays.fill(dp, 0);  //java automatically assigns 0 as default;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[n - 3];
        }
        System.out.println(dp[n]);
        //return dp[n];//to print Nth fibonacci

//        for (int i = 0; i <= n; i++) {//to print fibonacci series upto n
//            System.out.println(dp[i]);
//        }
    }

    static int fib_with_dp_pure_recursion(int n) {
        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
        return solve(n, dp);
    }

    static int solve(int n, int[] dp) {
        if (n < 2) return n;
        if (dp[n] != 0) return dp[n];
        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
        return dp[n];
    }


    static void main(String[] args) {
        n = 10;
//        print(0);
        //System.out.println(reverseNum(1004, 0));
        //  System.out.println(sumOfNaturalNums(10));
        //System.out.println(powOfNum(1, 5));
        //System.out.println(gcd(5,28));
        //System.out.println(lcm(8, 4, 1, 1));
        //System.out.println(fibonacci(30));
        //fibonacci_with_dp(4);
       // System.out.println(fib_with_dp_pure_recursion(10)+);

    }

}
