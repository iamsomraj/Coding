import java.util.*;

class Sort {
  int a[];

  Sort(int arr[]) {
    this.a = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      this.a[i] = arr[i];
    }
    mergeSort(this.a, 0, this.a.length - 1);
    display();
  }

  public void merge(int a[], int low, int mid, int high) {
    int i = low, j = mid + 1, k = low;
    int copyArr[] = new int[a.length];
    for (int m = 0; m < copyArr.length; m++) {
      copyArr[m] = a[m];
    }
    while (i <= mid && j <= high) {
      if (copyArr[i] < copyArr[j]) {
        a[k] = copyArr[i];
        i++;
      } else {
        a[k] = copyArr[j];
        j++;
      }
      k++;
    }

    if (i > mid) {
      while (j <= high) {
        a[k] = copyArr[j];
        k++;
        j++;
      }
    }

    if (j > high) {
      while (i <= mid) {
        a[k] = copyArr[i];
        k++;
        i++;
      }
    }

  }

  public void mergeSort(int a[], int low, int high) {
    if (low < high) {
      int mid = (int) Math.round((low + high) / 2);
      mergeSort(a, low, mid);
      mergeSort(a, mid + 1, high);
      merge(a, low, mid, high);
    }
  }

  public void display() {
    System.out.println("\nThe elements are displayed : \n");
    for (int i = 0; i < this.a.length; i++) {
      System.out.println(this.a[i]);
    }
  }

}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of elements of the array: \n");
    int arr[] = new int[sc.nextInt()];
    System.out.println("\nEnter the elements one by one : \n");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    new Sort(arr);
  }
}