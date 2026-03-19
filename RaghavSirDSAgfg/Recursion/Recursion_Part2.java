public class Recursion_Part2 {
//gfg lectures
    // leetcode unique paths

    //naive approach: tle problem
    public static int uniquePaths(int m, int n) {
        if (n == 1 || m == 1) return 1;
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }

    //using dp

    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        return solve(m, n, dp);
    }

    int solve(int m, int n, int[][] dp) {
        if (m == 1 || n == 1)
            return 1;
        if (dp[m][n] != 0)
            return dp[m][n];
        dp[m][n] = solve(m - 1, n, dp) + solve(m, n - 1, dp);
        return dp[m][n];
    }


    //recursion on Arrays
    static void recPrint(int[] arr, int idx) {
        if (idx >= arr.length) return;
        System.out.print(arr[idx] + " ");
        recPrint(arr, idx + 1);
    }

    //element exists in arr or not
    static boolean elementExistsOrNot(int[] arr, int idx, int target) {
        if (idx >= arr.length) return false;
        if (arr[idx] == target) return true;
        return elementExistsOrNot(arr, idx + 1, target);
    }


    //powerSet (all subsets of a string)

    public static void subSets(String s, int idx, String ans) {
        if (idx >= s.length()) {
            System.out.print(ans+" ");
            return;
        }
        subSets(s, idx + 1, ans + s.charAt(idx));
        subSets(s, idx + 1, ans);
    }

    static void main(String[] args) {
//        System.out.println(uniquePaths(2, 2));
        //Recursion_Part2 x = new Recursion_Part2();
        // System.out.println(x.uniquePaths2(12, 12));
        //recPrint(new int[]{1,2,3,4,5},0);
        //System.out.println(elementExistsOrNot(new int[]{1, 3, 3, 5, 6, 4}, 0, 3));
        subSets("abc", 0, "");

    }
}
