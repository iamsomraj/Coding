import java.util.*;

class Fibonacci {

  int num;

  Fibonacci(int num) {
    this.num = num;
  }

  public int fibonacci(int n) {

    if ( n == 1  || n == 0) {
      return n;
    }
    else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
    
  }

  public void calculate() {

    System.out.println("The first "+num+" terms of the fibonacci series is displayed: ");
    for(int i = 0; i<num; i++) {
      System.out.println(fibonacci(i));
    }
    
  }

}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    Fibonacci fibonacci = new Fibonacci(num);
    fibonacci.calculate();
  }
}