// Project Euler problem 2
// Print the sum of all even Fibonacci numbers below 4 million

public class Problem2 {

  public static void main(String[] args) {
    int total = 0;
    int prevNum = 0;
    for (int curNum = 1; curNum < 4000000; curNum += prevNum) {
      prevNum = curNum - prevNum;
      if ( curNum % 2 == 0) {
        total += curNum;
        System.out.printf("%d,", curNum);
      }
    }
    System.out.printf("\nSum total of even Fibonacci numbers below 4M: %d", total);
  }
}
