import java.util.*;

class Search {
  int a[];

  Search(int arr[]) {
    a = new int[arr.length];
    int k = 0;
    for (int i : arr) {
      a[k] = i;
      k++;
    }
  }

  public int findPos(int key) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == key) {
        return (i + 1);
      }
    }
    return -1;
  }

  public void find(int key) {

    int pos = findPos(key);

    if (pos == -1) {
      System.out.printf("\n\nThe element %d cannot be found on the list! ", key);
    } else {
      System.out.printf("\n\nThe element %d is found on the list at position %d ! ", key, pos);
    }

  }

}

public class App {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of elements: \n");
    int num = sc.nextInt();
    int arr[] = new int[num];
    System.out.println("Enter the elements one by one: ");
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    Search search = new Search(arr);
    System.out.println("\nEnter the element you want to find: \n");
    int key = sc.nextInt();
    search.find(key);

  }

}