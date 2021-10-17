package bruteforce;

public class GridTravelerBruteForce {

  public static int gridTraveler(int m, int n) {
    if (m == 1 || n == 1) {
      return 1;
    }
    if (m == 0 || n == 0) {
      return 0;
    }
    // Because grid can walk right, down
    return gridTraveler(m - 1, n) + gridTraveler(m, n - 1);
  }
}
