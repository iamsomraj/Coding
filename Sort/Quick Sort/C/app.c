#include<stdio.h>

int partition(int arr[], int low, int high) {

    int start = low, end = high;
    int pivot = arr[low];

    while( start < end ) {

        while ( pivot >= arr[start] ) {
            start++;
        }
        while ( pivot < arr[end] ) {
            end--;
        }

        if ( start < end ) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
        }

    }

    arr[low] = arr[end];
    arr[end] = pivot;


    return end;


}


void quickSort(int arr[], int low, int high) {

    if ( low < high ) {
        int location = partition(arr,low,high);
        quickSort(arr,low,location-1);
        quickSort(arr,location+1,high);
    }
}
int main() {

    int num;
    printf("\nEnter the number of elements: \n");
    scanf("%d",&num);
    int *arr = (int*)malloc(num*sizeof(int));
    printf("\nEnter the elements one by one: \n\n");
    for(int i = 0; i < num; i++ ) {
        scanf("%d",(arr+i));
    }
    printf("\nThe entered array is : \n");
    for(int i = 0; i < num; i++ ) {
        printf("\t%d\t",*(arr+i));
    }
    quickSort(arr,0,num-1);
    printf("\nAfter sorting, the array becomes: \n");
    for(int i = 0; i < num; i++ ) {
        printf("\t%d\t",*(arr+i));
    }


}
