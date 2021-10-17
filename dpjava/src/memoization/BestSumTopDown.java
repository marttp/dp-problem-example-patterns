package memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSumTopDown {

  public static List<Integer> bestSum(int target, List<Integer> list) {
    Map<Integer, List<Integer>> memo = new HashMap<>();
    return bestSum(target, list, memo);
  }

  private static List<Integer> bestSum(int target, List<Integer> list, Map<Integer, List<Integer>> memo) {
    if (memo.containsKey(target)) {
      return memo.get(target);
    }
    if (target == 0) {
      return new ArrayList<>();
    }
    if (target < 0) {
      return null;
    }
    List<Integer> shortestCombination = null;
    for (int n : list) {
      int remainder = target - n;
      var result = bestSum(remainder, list, memo);
      if (result != null) {
        var newList = new ArrayList<>(result);
        newList.add(n);
        if (shortestCombination == null || shortestCombination.size() > newList.size()) {
          shortestCombination = newList;
        }
      }
    }
    memo.put(target, shortestCombination);
    return memo.get(target);
  }
}
