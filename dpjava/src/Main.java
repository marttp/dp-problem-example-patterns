
import bruteforce.*;
import memoization.*;
import tabulation.*;

public class Main {
  public static void main(String[] args) {
    // Brute Force will take too much time to execute
    // Beware most of input

//    System.out.println(FibonacciBruteForce.fib(20));

     Main.memoization();
     Main.tabulation();
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
    System.out.println("Fibonacci");
    System.out.println(FibonacciTopDown.fib(1000));
    System.out.println("GridTraveler");
    System.out.println("canSum");
    System.out.println("howSum");
    System.out.println("bestSum");
    System.out.println("canConstruct");
    System.out.println("howConstruct");
    System.out.println("bestConstruct");
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
    System.out.println("Fibonacci");
    System.out.println(FibonacciBottomUp.fib(1000));
    System.out.println("GridTraveler");
    System.out.println("canSum");
    System.out.println("howSum");
    System.out.println("bestSum");
    System.out.println("canConstruct");
    System.out.println("howConstruct");
    System.out.println("bestConstruct");
  }
}
