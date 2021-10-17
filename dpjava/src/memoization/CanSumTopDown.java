package memoization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanSumTopDown {

  public static boolean canSum(int target, List<Integer> list) {
    Map<Integer, Boolean> memo = new HashMap<>();
    return canSum(target, list, memo);
  }

  public static boolean canSum(int target, List<Integer> list, Map<Integer, Boolean> memo) {
    if (memo.containsKey(target)) {
      return memo.get(target);
    }
    if (target == 0) {
      return Boolean.TRUE;
    }
    if (target < 0) {
      return Boolean.FALSE;
    }
    for (int n : list) {
      int remainder = target - n;
      if (canSum(remainder, list)) {
        memo.put(target, Boolean.TRUE);
        return memo.get(target);
      }
    }
    memo.put(target, Boolean.FALSE);
    return memo.get(target);
  }
}
