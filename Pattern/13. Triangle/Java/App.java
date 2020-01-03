import java.util.*;

class Triangle {
  int number;

  Triangle(int number) {
    this.number = number;
  }

  public void display() {
    System.out.println("The triangle pattern is displayed:");
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number - i - 1; j++) {
        System.out.printf("\t");
      }
      for(int j = 0; j < 2 * i + 1; j++) {
        System.out.printf("\t*");
      }
      System.out.println();
    }

  }
}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();
    Triangle triangle = new Triangle(n);
    triangle.display();
  }
}