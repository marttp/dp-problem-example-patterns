package tabulation;

import java.util.List;

public class CountConstructBottomUp {

  public static int countConstruct(String target, List<String> wordBank) {
    int[] table = new int[target.length() + 1];
    table[0] = 1;
    for (int i = 0; i <= target.length(); i++) {
      for (String str : wordBank) {
        int maxIndex = i + str.length();
        if (maxIndex <= target.length() && target.substring(i, maxIndex).equals(str)) {
          table[maxIndex] += table[i];
        }
      }
    }
    return table[target.length()];
  }
}
