package tabulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowSumBottomUp {

  public static List<Integer> howSum(int target, List<Integer> list) {
    List<List<Integer>> table = new ArrayList<>(Collections.nCopies(target + 1, null));
    table.set(0, new ArrayList<>());
    for (int i = 0; i <= target; i++) {
      if (table.get(i) != null) {
        for (int n : list) {
          if (i + n <= target) {
            var clonedList = new ArrayList<>(table.get(i));
            clonedList.add(n);
            table.set(i + n, clonedList);
          }
        }
      }
    }
    return table.get(target);
  }
}
