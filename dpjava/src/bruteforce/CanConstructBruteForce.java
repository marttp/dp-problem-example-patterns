package bruteforce;

import java.util.List;

public class CanConstructBruteForce {

  public static boolean canConstruct(String target, List<String> wordBank) {
    if (target.isEmpty()) {
      return Boolean.TRUE;
    }
    for (String str : wordBank) {
      if (target.startsWith(str)) {
        String suffix = target.substring(str.length());
        if (canConstruct(suffix, wordBank)) {
          return Boolean.TRUE;
        }
      }
    }
    return Boolean.FALSE;
  }
}
