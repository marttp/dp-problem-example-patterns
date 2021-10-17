package tabulation;

import java.util.List;

public class CanConstructBottomUp {

  public static boolean canConstruct(String target, List<String> wordBank) {
    boolean[] table = new boolean[target.length() + 1];
    table[0] = Boolean.TRUE;
    for (int i = 0; i <= target.length(); i++) {
      if (table[i]) {
        for (String str : wordBank) {
          int maxIndex = i + str.length();
          if (maxIndex <= target.length() && target.substring(i, maxIndex).equals(str)) {
            table[maxIndex] = Boolean.TRUE;
          }
        }
      }
    }
    return table[target.length()];
  }
}
