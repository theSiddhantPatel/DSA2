public class matIsTarget1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        //transpose
        for (int t = 0; t < 4; t++) {
            if (isEqual(mat, target)) return true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            //reverse each row
            for (int i = 0; i < n; i++) {
                int l = 0;
                int r = n - 1;
                while (l < r) {
                    int temp = mat[l][r];
                    mat[l][r] = mat[r][l];
                    mat[r][l] = temp;
                    l++;
                    r--;
                }
            }
        }
        return false;
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}


//for 90° clock wise rotate
//1. transpose
//2. reverse each row

//for 90° anti-clock wise rotate
//1. transpose
//2.reverse each column