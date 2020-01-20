package Java;

import java.util.Scanner;

/**
 * App
 */
public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the string : \n");
    String input = sc.nextLine();
    String reversed = new String();
    for (int i = (  input.length() - 1 ); i >= 0; i--) {
      reversed = reversed + input.charAt(i);
    }
    System.out.println("\nThe string now becomes : \n");
    System.out.println(reversed);
  }
}