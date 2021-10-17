package memoization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllConstructTopDown {

  public static List<List<String>> allConstruct(String target, List<String> wordBank) {
    Map<String, List<List<String>>> memo = new HashMap<>();
    return allConstruct(target, wordBank, memo);
  }

  private static List<List<String>> allConstruct(String target, List<String> wordBank,
      Map<String, List<List<String>>> memo) {
    if (memo.containsKey(target)) {
      return memo.get(target);
    }
    if (target.isEmpty()) {
      List<List<String>> newSetCombination = new ArrayList<>();
      newSetCombination.add(Collections.emptyList());
      return newSetCombination;
    }
    List<List<String>> result = new ArrayList<>();
    for (String str : wordBank) {
      if (target.startsWith(str)) {
        String suffix = target.substring(str.length());
        var suffixWay = allConstruct(suffix, wordBank, memo);
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
    memo.put(target, result);
    return memo.get(target);
  }
}
