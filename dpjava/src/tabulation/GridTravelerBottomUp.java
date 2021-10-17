package tabulation;

public class GridTravelerBottomUp {

  public static int gridTraveler(int m, int n) {
    int[][] table = new int[m + 1][n + 1];
    table[1][1] = 1;
    for (int r = 0; r <= m; r++) {
      for (int c = 0; c <= n; c++) {
        int current = table[r][c];
        if (r + 1 <= m) {
          table[r + 1][c] += current;
        }
        if (c + 1 <= n) {
          table[r][c + 1] += current;
        }
      }
    }
    return table[m][n];
  }
}
