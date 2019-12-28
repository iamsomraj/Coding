import java.util.*;

class Minmax {
  int a[];

  Minmax(int arr[]) {
    a = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      a[i] = arr[i];
    }
  }

  public void display() {

    int max = Integer.MIN_VALUE;
    int secondMax = max + 1;

    int min = Integer.MAX_VALUE;
    int secondMin = min - 1;

    for (int i : a) {

      // Maximum Logic
      if (max < i) {
        secondMax = max;
        max = i;
      } else if (secondMax < i && i != max) {
        secondMax = i;
      }

      // Minimum Logic
      if (min > i) {
        secondMin = min;
        min = i;
      } else if (secondMin > i && i != min) {
        secondMin = i;
      }

    }

    System.out.println("The Maximum Value is " + max);
    System.out.println("The Second Maximum Value is " + secondMax);

    System.out.println("The Minimum Value is " + min);
    System.out.println("The Second Minimum Value is " + secondMin);

  }

}

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int num = sc.nextInt();
    System.out.println("Enter the elements one by one: ");
    int arr[] = new int[num];
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    Minmax minmax = new Minmax(arr);
    minmax.display();
  }
}