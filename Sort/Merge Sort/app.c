#include<stdlib.h>
#include<stdio.h>

void merge(int arr[], int low, int mid, int high) {
    int i = low, j = mid+1, k = low;
    int copyArr[high+1];
    for(int m  = 0 ; m < high+1; m++) {
        copyArr[m] = arr[m];
    }
    while( i <= mid && j <= high ) {
        if(copyArr[i] < copyArr[j]) {
            arr[k] = copyArr[i];
            i++;
        } else {
            arr[k] = copyArr[j];
            j++;
        }
        k++;
    }
    if( i > mid ) {
        while ( j <= high ) {
            arr[k] = copyArr[j];
            k++;
            j++;
        }
    }
    if( j > high ) {
        while ( i <= mid ) {
            arr[k] = copyArr[i];
            k++;
            i++;
        }
    }
}


void mergeSort(int arr[], int low, int high) {
    if (low < high) {
        int mid = (int) ((low+high) / 2 );
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
}



int main() {

    int num;
    printf("\nEnter the number of elements: \n");
    scanf("%d",&num);
    int *arr = (int*)malloc(num*sizeof(int));
    printf("\nEnter the number of elements : \n");
    for(int i = 0 ; i < num; i++ ) {
        scanf("%d",(arr+i));
    }
    printf("\nThe array entered is:  \n");
    for(int i = 0 ; i < num; i++ ) {
        printf("%d\t",*(arr+i));
    }

    mergeSort(arr,0,num-1);

    printf("\nThe array now becomes after sorting :  \n");
    for(int i = 0 ; i < num; i++ ) {
        printf("%d\t",*(arr+i));
    }
    return 0;
}
