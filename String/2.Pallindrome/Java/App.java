import java.util.Scanner;

class Pallindrome {
  public static Boolean isPallindrome(String str) {
    byte[] normal = str.getBytes();
    byte[] reverse = new byte[normal.length];
    int k = 0;
    for ( int i = normal.length - 1 ; i > -1 ; i-- ) {
      reverse[k] = normal[i];
      k++;
    }
    for (int i = 0 ; i < normal.length; i++ ) {
      if ( normal[i] != reverse[i] ) {
        return false;
      }
    }
    return true;
  }
}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the string : \n");
    String input = sc.nextLine();
    if (Pallindrome.isPallindrome(input)) {
      System.out.println("\nThe entered string is pallindrome!\n");
    } else {
      System.out.println("\nThe entered string is not pallindrome!\n");
    }
  }
}