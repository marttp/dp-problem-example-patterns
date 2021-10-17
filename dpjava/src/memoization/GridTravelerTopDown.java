package memoization;

import java.util.HashMap;
import java.util.Map;

public class GridTravelerTopDown {

  public static int gridTraveler(int m, int n) {
    Map<String, Integer> memo = new HashMap<>();
    return gridTraveler(m, n, memo);
  }

  public static int gridTraveler(int m, int n, Map<String, Integer> memo) {
    String key = m + ":" + n;
    if (memo.containsKey(key)) {
      return memo.get(key);
    }
    if (m == 1 || n == 1) {
      return 1;
    }
    if (m == 0 || n == 0) {
      return 0;
    }
    memo.put(key, gridTraveler(m - 1, n, memo) + gridTraveler(m, n - 1, memo));
    // Because grid can walk right, down
    return memo.get(key);
  }
}
