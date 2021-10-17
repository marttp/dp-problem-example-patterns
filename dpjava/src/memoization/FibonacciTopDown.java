package memoization;

import java.util.HashMap;
import java.util.Map;

public class FibonacciTopDown {

  public static int fib(int n) {
    Map<Integer, Integer> memo = new HashMap<>();
    return fib(n, memo);
  }

  public static int fib(int n, Map<Integer, Integer> memo) {
    if (memo.containsKey(n)) {
      return memo.get(n);
    }
    if (n <= 2) {
      return 1;
    }
    memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
    return memo.get(n);
  }
}
