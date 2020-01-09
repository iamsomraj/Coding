import java.util.Scanner;

class Sort {
    int arr[];

    Sort(int arr[]) {
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    public void insertionSort() {

        for (int i = 1; i < this.arr.length; i++) {
            int temp = this.arr[i];
            System.out.println("\nTemp : " + temp + "\n");
            int j = i - 1;
            while (j >= 0 && this.arr[j] > temp) {
                System.out.printf("\n %d > temp = %d", this.arr[j], temp);
                this.arr[j + 1] = this.arr[j];
                j--;
            }
            System.out.printf("\n\n\nSwapped :  %d and %d\n", this.arr[j + 1], temp);
            this.arr[j + 1] = temp;

        }

        System.out.println("\nThe elements are displayed one after another: \n");
        System.out.println("\nAscending order: \n");
        for (int i : this.arr) {
            System.out.println(i);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of the elements : \n");
        int arr[] = new int[sc.nextInt()];
        System.out.println("\nEnter the elements one by one:\n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Sort sort = new Sort(arr);
        sort.insertionSort();
    }
}