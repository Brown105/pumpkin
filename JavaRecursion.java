// Patrick Singh
// CS145 Lab Prog Assignment_6: Recursion
// May 23 2024


public class Main {
  public static void main(String[] args) {
    int result = sum(10); // Calling the sum function with the argument 10
    System.out.println(result); // Printing the result
  }
  
  // Recursive function to calculate the sum of numbers up to k
  public static int sum(int k) {
    if (k > 0) {
      // If k is greater than 0, recursively call sum with k-1 and add k to the result
      return k + sum(k - 1);
    } else {
      // Base case: if k is 0, return 0
      return 0;
    }
  }
}
