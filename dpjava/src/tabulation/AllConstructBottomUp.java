package tabulation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllConstructBottomUp {

  public static List<List<String>> allConstruct(String target, List<String> wordBank) {
    List<List<List<String>>> table = Stream.generate(
            (Supplier<ArrayList<List<String>>>) ArrayList::new
        )
        .limit(target.length() + 1)
        .collect(Collectors.toList());
    table.get(0).add(new ArrayList<>());

    for (int i = 0; i <= target.length(); i++) {
      for (String str : wordBank) {
        int maxIndex = i + str.length();
        if (maxIndex <= target.length() && target.substring(i, maxIndex).equals(str)) {
          var prevList = table.get(i);
          var combination = prevList.stream()
              .map(list -> {
                List<String> clonedList = new ArrayList<>(list);
                clonedList.add(str);
                return clonedList;
              })
              .collect(Collectors.toList());
          table.get(maxIndex).addAll(combination);
        }
      }
    }
    return table.get(target.length());
  }
}
