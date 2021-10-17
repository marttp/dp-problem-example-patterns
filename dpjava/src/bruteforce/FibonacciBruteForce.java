package bruteforce;

public class FibonacciBruteForce {

  public static int fib(int n) {
    if (n <= 2) {
      return 1;
    }
    return fib(n - 1) + fib(n - 2);
  }
}
