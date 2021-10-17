package memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSumTopDown {

  public static List<Integer> howSum(int target, List<Integer> list) {
    Map<Integer, List<Integer>> memo = new HashMap<>();
    return howSum(target, list, memo);
  }

  private static List<Integer> howSum(int target, List<Integer> list, Map<Integer, List<Integer>> memo) {
    if (memo.containsKey(target)) {
      return memo.get(target);
    }
    if (target == 0) {
      return new ArrayList<>();
    }
    if (target < 0) {
      return null;
    }
    for (int n : list) {
      int remainder = target - n;
      var result = howSum(remainder, list, memo);
      if (result != null) {
        var cloned = new ArrayList<>(result);
        cloned.add(n);
        memo.put(target, cloned);
        return memo.get(target);
      }
    }
    memo.put(target, null);
    return memo.get(target);
  }
}
