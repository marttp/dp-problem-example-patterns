package tabulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestSumBottomUp {

  public static List<Integer> bestSum(int target, List<Integer> list) {
    List<List<Integer>> table = new ArrayList<>(Collections.nCopies(target + 1, null));
    table.set(0, new ArrayList<>());
    for (int i = 0; i <= target; i++) {
      if (table.get(i) != null) {
        for (int n : list) {
          if (i + n <= target) {
            var clonedList = new ArrayList<>(table.get(i));
            clonedList.add(n);
            if (table.get(i + n) == null || table.get(i + n).size() > clonedList.size()) {
              table.set(i + n, clonedList);
            }
          }
        }
      }
    }
    return table.get(target);
  }
}
