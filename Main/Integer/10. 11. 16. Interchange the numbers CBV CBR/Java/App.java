import java.util.*;

class Number {
  int a;
  int b;

  Number(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void SwapValue(int a, int b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
  }

  public void swapReference(Number num) {
    num.a = num.a ^ num.b;
    num.b = num.a ^ num.b;
    num.a = num.a ^ num.b;
  }
}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers one by one : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    Number number = new Number(num1, num2);
    System.out.println("Call by Value: ");
    System.out.println("Before");
    System.out.println(number.a + " " + number.b);
    number.SwapValue(num1, num2);
    System.out.println("After");
    System.out.println(number.a + " " + number.b);
    System.out.println("Call by Reference: ");
    System.out.println("Before");
    System.out.println(number.a + " " + number.b);
    number.swapReference(number);
    System.out.println("After");
    System.out.println(number.a + " " + number.b);

  }
}