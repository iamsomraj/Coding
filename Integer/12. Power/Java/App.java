import java.util.*;
class Power {
  int number, exponent, result = 1;

  Power(int number , int exponent) {
    this.number = number;
    this.exponent = exponent;
  }

  public void calculate() {
    for(int i = 1; i <= exponent; i++) {
      result = result * number;
    }
    System.out.println("The result of the power is: "+result);
  }
}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int number = sc.nextInt();
    System.out.println("Enter the exponent: ");
    int exponent = sc.nextInt();
    Power pow = new Power(number,exponent);
    pow.calculate();
  }
}