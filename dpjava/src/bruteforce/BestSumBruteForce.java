package bruteforce;

import java.util.ArrayList;
import java.util.List;

public class BestSumBruteForce {

  public static List<Integer> bestSum(int target, List<Integer> list) {
    if (target == 0) {
      return new ArrayList<>();
    }
    if (target < 0) {
      return null;
    }
    List<Integer> shortestCombination = null;
    for (int n : list) {
      int remainder = target - n;
      var result = bestSum(remainder, list);
      if (result != null) {
        var newList = new ArrayList<>(result);
        newList.add(n);
        if (shortestCombination == null || shortestCombination.size() > newList.size()) {
          shortestCombination = newList;
        }
      }
    }
    return shortestCombination;
  }
}
