package tabulation;

import java.util.List;

public class CanSumBottomUp {

  public static boolean canSum(int target, List<Integer> list) {
    boolean[] table = new boolean[target + 1];
    table[0] = Boolean.TRUE;
    for (int i = 0; i <= target; i++) {
      if (table[i]) {
        for (int n : list) {
          if (i + n <= target) {
            table[i + n] = Boolean.TRUE;
          }
        }
      }
    }
    return table[target];
  }
}
