import java.util.Scanner;

class Prime {
  int number;

  Prime(int number)

  {
    this.number = number;
  }

  public Boolean isPrime() {

    for (int i = 2; i <= (int) Math.round(Math.pow(number, 0.5)); i++) {
      if (number % i == 0) {
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
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    Prime prime = new Prime(num);
    if (prime.isPrime()) {
      System.out.println("The given number is prime number ");
    } else {
      System.out.println("the given number is not a prime number ");
    }
  }
}