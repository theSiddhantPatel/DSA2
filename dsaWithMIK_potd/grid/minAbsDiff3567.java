import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i < m - k + 1; i++) {
            for (int j = 0; j < n - k + 1; j++) {

                ArrayList<Integer> list = new ArrayList<>();

                for (int r = i; r < i + k; r++) {
                    for (int c = j; c < j + k; c++) {
                        list.add(grid[r][c]);
                    }
                }
                Collections.sort(list);
                int minDiff = Integer.MAX_VALUE;

                for (int x = 1; x < list.size(); x++) {
                    int diff = list.get(x) - list.get(x - 1);
                    if (diff == 0)
                        continue;

                    minDiff = Math.min(minDiff, diff);
                }
                if (minDiff == Integer.MAX_VALUE)
                    minDiff = 0;

                ans[i][j] = minDiff;
            }
        }
        return ans;
    }
}