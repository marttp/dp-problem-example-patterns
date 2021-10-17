package memoization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanConstructTopDown {

  public static boolean canConstruct(String target, List<String> wordBank) {
    Map<String, Boolean> memo = new HashMap<>();
    return canConstruct(target, wordBank, memo);
  }

  private static boolean canConstruct(String target, List<String> wordBank,
      Map<String, Boolean> memo) {
    if (memo.containsKey(target)) {
      return memo.get(target);
    }
    if (target.isEmpty()) {
      return Boolean.TRUE;
    }
    for (String str : wordBank) {
      if (target.startsWith(str)) {
        String suffix = target.substring(str.length());
        if (canConstruct(suffix, wordBank, memo)) {
          memo.put(target, Boolean.TRUE);
          return memo.get(target);
        }
      }
    }
    memo.put(target, Boolean.FALSE);
    return memo.get(target);
  }
}
