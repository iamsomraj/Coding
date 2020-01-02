import java.util.*;

class GCD {
  public int calculate(int a, int b) {

    if (b > a) {
      calculate(b, a);
    }
    if (b == 0) {
      return a;
    } else {
      return calculate(b, a % b);
    }
  }
}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number one: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the number two: ");
    int num2 = sc.nextInt();
    GCD gcd = new GCD();
    int res = gcd.calculate(num1, num2);
    System.out.println("The result of the GCD is : " + res);
  }
}
