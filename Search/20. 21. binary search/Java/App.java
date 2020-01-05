import java.util.*;

class Binary {

  int arr[];

  Binary(int a[]) {
    int k = 0;
    arr = new int[a.length];
    for (int i : a) {
      arr[k] = i;
      k++;
    }
  }

  public int search(int key, int low, int high) {

    while (low < high) {
      int mid = (int) Math.round(low + high / 2);
      if (key == this.arr[mid]) {
        return mid;
      } else if (key > this.arr[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;

  }

}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nThe elements of the array are :\n");
    int arr[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
    System.out.println();
    for (int i : arr) {
      System.out.printf("%d\t", i);
    }
    System.out.println("\n\nEnter the element you want to search: \n");
    int key = sc.nextInt();
    Binary binary = new Binary(arr);
    int pos = binary.search(key, 0, arr.length - 1);

    if (pos == -1) {
      System.out.printf("\n\nThe element %d cannot be found!", key);
    } else {
      System.out.printf("\n\nThe element %d is found at position %d !", key, pos + 1);
    }
  }
}
