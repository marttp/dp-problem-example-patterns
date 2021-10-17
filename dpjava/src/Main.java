
import bruteforce.*;
import java.util.ArrayList;
import java.util.List;
import memoization.*;
import tabulation.*;

public class Main {

  public static void main(String[] args) {
    Main.bruteForce();
    Main.memoization();
    Main.tabulation();
  }

  public static void bruteForce() {
    // Brute Force will take too much time to execute
    // Beware most of input
    System.out.println("====Brute Force Recursive====");
    System.out.println("Fibonacci: " + FibonacciBruteForce.fib(10));
    System.out.println("GridTraveler: " + GridTravelerBruteForce.gridTraveler(10, 10));

    System.out.println("canSum: " + CanSumBruteForce.canSum(7, List.of(5, 3, 4, 7)));
    System.out.println("howSum: " + HowSumBruteForce.howSum(7, List.of(5, 3, 4, 7)));
    System.out.println("bestSum: " + BestSumBruteForce.bestSum(7, List.of(5, 3, 4, 7)));

    String target = "abcdef";
    List<String> wordBank = List.of("ab", "abc", "cd", "def", "abcd");
    System.out.println("canConstruct: " + CanConstructBruteForce.canConstruct(target, wordBank));
    System.out.println("howConstruct: ");
    System.out.println("bestConstruct: ");
  }

  /*
   * Memoization Recipe
   * 1. Make it work
   * - Visualize the problem as a tree
   * - Implement the tree using recursion
   * - Test it for correct answer
   * 2. Make it efficient
   * - Add a memo object
   * - Add a base case to return memo value
   * - Store return value into memo before return
   * - Use method or function that use memo as a parameter/an argument
   * */
  public static void memoization() {
    System.out.println("====Top-Down====");
    System.out.println("Fibonacci: " + FibonacciTopDown.fib(1000));
    System.out.println("GridTraveler: " + GridTravelerTopDown.gridTraveler(1000, 1000));

    System.out.println("canSum: " + CanSumTopDown.canSum(7, List.of(5, 3, 4, 7)));
    System.out.println("howSum: " + HowSumTopDown.howSum(7, List.of(5, 3, 4, 7)));
    System.out.println("bestSum: " + BestSumTopDown.bestSum(7, List.of(5, 3, 4, 7)));

    String target = "abcdef";
    List<String> wordBank = List.of("ab", "abc", "cd", "def", "abcd");
    System.out.println("canConstruct: " + CanConstructTopDown.canConstruct(target, wordBank));
    System.out.println("howConstruct: ");
    System.out.println("bestConstruct: ");
  }

  /*
   * Tabulation Recipe
   * - Visualize the problem as a table
   * - Size the table based on the inputs
   * - Initialize the table with default values
   * - Seed the trivial answer into the table
   * - Iterate through the table
   * - Fill further positions based on the current position
   * */
  public static void tabulation() {
    System.out.println("====Bottom-Up====");
    System.out.println("Fibonacci: " + FibonacciBottomUp.fib(1000));
    System.out.println("GridTraveler: " + GridTravelerBottomUp.gridTraveler(1000, 1000));

    System.out.println("canSum: " + CanSumBottomUp.canSum(7, List.of(5, 3, 4, 7)));
    System.out.println("howSum: " + HowSumBottomUp.howSum(7, List.of(5, 3, 4, 7)));
    System.out.println("bestSum: " + BestSumBottomUp.bestSum(7, List.of(5, 3, 4, 7)));

    String target = "abcdef";
    List<String> wordBank = List.of("ab", "abc", "cd", "def", "abcd");
    System.out.println("canConstruct: " + CanConstructBottomUp.canConstruct(target, wordBank));
    System.out.println("howConstruct: ");
    System.out.println("bestConstruct: ");
  }
}
