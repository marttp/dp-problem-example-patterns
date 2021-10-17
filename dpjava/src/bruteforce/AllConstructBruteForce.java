package bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AllConstructBruteForce {

  public static List<List<String>> allConstruct(String target, List<String> wordBank) {
    if (target.isEmpty()) {
      List<List<String>> newSetCombination = new ArrayList<>();
      newSetCombination.add(Collections.emptyList());
      return newSetCombination;
    }
    List<List<String>> result = new ArrayList<>();
    for (String str : wordBank) {
      if (target.startsWith(str)) {
        String suffix = target.substring(str.length());
        var suffixWay = allConstruct(suffix, wordBank);
        var targetWay = suffixWay.stream()
            .map(list -> {
              List<String> clonedList = new ArrayList<>(list);
              clonedList.add(str);
              return clonedList;
            })
            .collect(Collectors.toList());
        result.addAll(targetWay);
      }
    }
    return result;
  }
}
