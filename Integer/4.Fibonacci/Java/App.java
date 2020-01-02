import java.util.*;

class Fibonacci {
  int num;

  Fibonacci(int n) {
    this.num = n;
  }

  public void display() {

    int a = 0, b = 1, sum = a + b;
    System.out.println("The Fibonacci series is displayed below: \n\n");
    while (num != 0) {
      System.out.println(a);
      a = b;
      b = sum;
      sum = a + b;
      num--;
    }
  }
}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number: \n");
    int n = sc.nextInt();
    Fibonacci fibonacci = new Fibonacci(n);
    fibonacci.display();
  }
}