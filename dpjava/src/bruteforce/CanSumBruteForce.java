package bruteforce;

import java.util.List;

public class CanSumBruteForce {
  public static boolean canSum(int target, List<Integer> list) {
    if (target == 0) {
      return Boolean.TRUE;
    }
    if (target < 0) {
      return Boolean.FALSE;
    }
    for (int n : list) {
      int remainder = target - n;
      if (canSum(remainder, list)) {
        return true;
      }
    }
    return false;
  }
}
