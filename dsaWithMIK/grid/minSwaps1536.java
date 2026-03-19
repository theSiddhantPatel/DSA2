public class minSwaps1536 {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] endZeros = new int[n];
        //count no. of 0s' in each row
        for (int i = 0; i < n; i++) {
            int j = n - 1;
            int count = 0;
            while (grid[i][j] == 0) {
                j--;
                count++;
            }
            endZeros[i] = count;
        }
        //required 0s' for each row (choose nearest row for minimum swap)
        int steps = 0;
        for (int i = 0; i < n; i++) {
            int required = n - i - 1;
            int j = i;
            while (j < n && endZeros[j] < required) {
                j++;
            }
            if (j == n) return -1;
            steps += j - i;
            //swap the places
            while (j > i) {
                int temp = endZeros[j];
                endZeros[j] = endZeros[j-1];
                endZeros[j-1] = temp;
                j--;
            }
        }
        return steps;
    }
}
