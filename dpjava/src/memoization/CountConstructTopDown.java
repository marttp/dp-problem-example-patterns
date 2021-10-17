package memoization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountConstructTopDown {

  public static int countConstruct(String target, List<String> wordBank) {
    Map<String, Integer> memo = new HashMap<>();
    return countConstruct(target, wordBank, memo);
  }

  private static int countConstruct(String target, List<String> wordBank,
      Map<String, Integer> memo) {
    if (memo.containsKey(target)) {
      return memo.get(target);
    }
    if (target.isEmpty()) {
      return 1;
    }
    int count = 0;
    for (String str : wordBank) {
      if (target.startsWith(str)) {
        String suffix = target.substring(str.length());
        count += countConstruct(suffix, wordBank, memo);
      }
    }
    memo.put(target, count);
    return memo.get(target);
  }
}
