// Project Euler problem 1
// Print the sum of all multiples of 3 and 5 beneath 1000

import java.util.ArrayList;

public class Problem1 {

  public static void main(String[] args) {
    int i = 1;
    int mult = 3;
    int total = 0;
    while (mult < 1000) {
      total += mult;
      i++;
      mult = 3 * i;
    }
    i = 0;
    mult = 5;
    while (mult < 1000) {
      if ( mult % 3 != 0) {total += mult;}
      i++;
      mult = 5 * i;
    }
    System.out.printf("\nSum total of multiples of 3 and 5 beneath 1000: %d", total);
  }
}
