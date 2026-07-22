import java.util.ArrayList;
import java.util.List;

public class rotate_array1260 {

  public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    int m = grid.length;
    int n = grid[0].length;

    k = k % (m * n);

    int[] arr = new int[m * n];
    int l = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[l++] = grid[i][j];
      }
    }
    reverse(arr, 0, m * n - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, m * n - 1);
    List<List<Integer>> list = new ArrayList();
    l = 0;

    for (int i = 0; i < m; i++) {
      List<Integer> ls = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        ls.add(arr[l++]);
      }
      list.add(ls);
    }

    return list;
  }

  public List<List<Integer>> shiftGrid2(int[][] grid, int k) {
    List<List<Integer>> list = new ArrayList();
    int row = grid.length;
    int col = grid[0].length;
    int n = row * col;
    k = k % n;
    reverse2(grid, 0, n - 1, row, col);
    reverse2(grid, 0, k - 1, row, col);
    reverse2(grid, k, n - 1, row, col);

    for (int i = 0; i < row; i++) {
      List<Integer> ls = new ArrayList<>();
      for (int j = 0; j < col; j++) {
        ls.add(grid[i][j]);
      }
      list.add(ls);
    }

    return list;
  }

  void reverse(int[] arr, int i, int j) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  void reverse2(int[][] arr, int i, int j, int row, int col) {
    while (i < j) {
      int temp = arr[i / col][i % col];
      arr[i / col][i % col] = arr[j / col][j % col];
      arr[j / col][j % col] = temp;
      i++;
      j--;
    }
  }
}
