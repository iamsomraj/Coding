import java.util.Scanner;

class Sort {
  int a[];

  Sort(int arr[]) {
    this.a = new int[arr.length];
    for (int i = 0; i < a.length; i++) {
      this.a[i] = arr[i];
    }
    quickSort(this.a, 0, ((this.a.length)-1));
  }

  public int partition(int arr[], int low, int high) {
    int start = low, end = high;
    int pivot = arr[low];
    while (start < end) {

      while (pivot >= arr[start]) {
        start++;
      }
      while (pivot < arr[end]) {
        end--;
      }

      if (start < end) {
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
      }

    }

    arr[low] = arr[end];
    arr[end] = pivot;

    return end;
  }

  public void quickSort(int a[], int low, int high) {

    if (low < high) {
      int location = partition(a, low, high);
      quickSort(a, low, location - 1);
      quickSort(a, location + 1, high);
    }

  }

  public void display() {
    System.out.println("\nThe elements are displayed : \n");
    for (int i : a) {
      System.out.println(i);
    }
  }
}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of elements : \n");
    int num = sc.nextInt();
    int arr[] = new int[num];
    System.out.println("\nEnter the elements one by one : \n");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    Sort sort = new Sort(arr);
    sort.display();
  }
}