import java.util.*;

class Pascal {

  int triangle[][];

  int num;

  Pascal(int number) {
    this.num = number;
    triangle = new int[number+1][number+1];
  }

  public void display() {
    System.out.println("The triangle is displayed below: ");
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num - i + 1; j++) {
        System.out.printf("\t");
      }
      for (int j = 1; j <= i; j++) {
        if ( i == 1 || j == i ) {
          triangle[i][j] = 1;
        }
        else {
            triangle[i][j] = (triangle[i-1][j] + triangle[i-1][j-1]);
        }
        System.out.printf("\t%d\t",triangle[i][j]);
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
    System.out.println("\nEnter the numbers: \n");
    int number = sc.nextInt();
    Pascal pascal = new Pascal(number);
    pascal.display();
  }

}