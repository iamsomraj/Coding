import java.util.*;
class Factorial {

  int number ;

  Factorial(int number) {
    this.number = number;
  }

  public void calculate() {
    int fact = 1;
    for(int i = 1; i <= number; i++) {
      fact = fact * i;
    }
    System.out.println("The value of the factorial is : "+fact);    
  }

}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number :\n");
    int number = sc.nextInt();
    Factorial factorial = new Factorial(number);
    factorial.calculate();
  }
}