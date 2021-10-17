package bruteforce;

import java.util.List;

public class CountConstructBruteForce {

  public static int countConstruct(String target, List<String> wordBank) {
    if (target.isEmpty()) {
      return 1;
    }
    int count = 0;
    for (String str : wordBank) {
      if (target.startsWith(str)) {
        String suffix = target.substring(str.length());
        count += countConstruct(suffix, wordBank);
      }
    }
    return count;
  }
}
