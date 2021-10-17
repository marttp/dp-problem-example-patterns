package tabulation;

public class FibonacciBottomUp {

  public static int fib(int n) {
    int[] table = new int[n + 1];
    table[1] = 1;
    for (int i = 2; i <= n; i++) {
      table[i] = table[i - 1] + table[i - 2];
    }
    return table[n];
  }
}
