// Project Euler problem 1
// Print the sum of all multiples of 3 and 5 beneath 1000

import java.util.ArrayList;

public class Problem1 {

  public static void main(String[] args) {
    int total = 0;
    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0 ) { 
        total += i;
      }
    }
    System.out.printf("\nSum total of multiples of 3 and 5 beneath 1000: %d", total);
  }
}
