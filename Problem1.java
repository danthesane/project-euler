// Project Euler problem 1
// Print the sum of all multiples of 3 and 5 beneath 1000

import java.util.ArrayList;

public class Problem1 {

  public static void main(String[] args) {
    int i = 1;
    int total = 0;
    while (i < 1000) {
      if (i % 3 == 0 || i % 5 == 0 ) { 
        total += i;
      }
      i++;
    }
    System.out.printf("\nSum total of multiples of 3 and 5 beneath 1000: %d", total);
  }
}
