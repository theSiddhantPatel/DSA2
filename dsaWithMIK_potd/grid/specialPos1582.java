public class specialPos1582 {
    public static int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            int exist1 = 0;int col=-1;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) exist1++;
                col=j;
            }
            int exist_1 = 0;
            for (int k = 0; k < m; k++) {
                if (mat[k][col] == 1) exist_1++;
            }
            if (exist1 == 1 && exist_1 == 1) count++;
        }
        return count;
    }

    static void main() {
//        int[][]mat=
        System.out.println(numSpecial(new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        }));
    }
}
