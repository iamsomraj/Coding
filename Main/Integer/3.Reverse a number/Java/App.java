import java.util.*;
class Number {
  int number;
  Number(int n) {
    this.number = n;
  }

  public void reverse() {
    int temp = this.number;
    int rev = 0;
    while(temp!=0) {
      int rem = temp % 10;
      rev = rev * 10 + rem;
      temp /= 10;
    }
    System.out.println("The reverse number is "+rev);
  }

}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    Number number = new Number(num);
    number.reverse();
  }
}