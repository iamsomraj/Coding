/* Insertion sort in C by iamsomraj */

#include<stdio.h>
void insertionSort(int* a, int n) {
    for(int i = 1; i < n ; i++) {
        int temp = a[i];
        int j = i - 1;
        while( j >= 0 && a[j] > temp ) {
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = temp;
    }
}
int main() {
    int n;
    printf("\nEnter the number of elements: \n");
    scanf("%d",&n);
    int* a = (int*)malloc(n*sizeof(int));
    printf("\nEnter the elements of the array : \n");
    for(int i = 0 ; i < n; i++ ) {
        scanf("%d",a+i);
    }
    printf("\nThe given array is displayed : \n");
    for(int i = 0 ; i < n; i++ ) {
        printf("%d\t",*(a+i));
    }
    insertionSort(a,n);
    printf("\n\nThe given array is displayed after sorting: \n\n");
    for(int i = 0; i < n; i++ ) {
        printf("\n%d\n",*(a+i));
    }

}
