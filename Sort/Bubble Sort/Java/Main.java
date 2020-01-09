import java.util.*;

class Sort {

    int arr[];

    Sort(int array[]) {
        this.arr = new int[array.length];
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = array[i];
        }
    }

    public void bubbleSort() {

        for (int i = 0; i < this.arr.length - 1; i++) {
            for (int j = 0; j < this.arr.length - i - 1; j++) {
                if (this.arr[j] > this.arr[j + 1]) {
                    // just wanted to practice the swapping without third variable
                    this.arr[j] = this.arr[j] + this.arr[j + 1];
                    this.arr[j + 1] = this.arr[j] - this.arr[j + 1];
                    this.arr[j] = this.arr[j] - this.arr[j + 1];
                }
            }
        }

        System.out.println("\nThe elements are displayed one by one: \n");
        System.out.println("\nThe order is ascending order: \n");
        for (int i : this.arr) {
            System.out.println(i);
        }

    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of the elements: \n");
        int array[] = new int[sc.nextInt()];
        System.out.println("\nEnter the elements one by one:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Sort sort = new Sort(array);
        sort.bubbleSort();
    }
}