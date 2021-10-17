package bruteforce;

import java.util.ArrayList;
import java.util.List;

public class HowSumBruteForce {
  public static List<Integer> howSum(int target, List<Integer> list) {
    if (target == 0) {
      return new ArrayList<>();
    }
    if (target < 0) {
      return null;
    }
    for (int n : list) {
      int remainder = target - n;
      var result = howSum(remainder, list);
      if (result != null) {
        var newList = new ArrayList<>(result);
        newList.add(n);
        return newList;
      }
    }
    return null;
  }
}
