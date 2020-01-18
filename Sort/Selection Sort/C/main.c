#include<stdio.h>
#include<stdlib.h>
void selectionSort(int *a, int n) {
    for(int i = 0; i < n - 1; i++ ) {
        int min = i;
        for(int j = i + 1; j < n; j++) {
            if ( a[min] > a[j] ) {
                min = j;
            }
        }
        if ( min != i ) {
            a[min] = a[min] + a[i];
            a[i] = a[min] - a[i];
            a[min] = a[min] - a[i];
        }
    }
}
int main() {
    int n;
    printf("\nEnter the number of the elements : \n");
    scanf("%d",&n);
    int *a = (int*)malloc(n*sizeof(int));
    printf("\nEnter the elements one by one : \n");
    for(int i = 0; i < n ; i++ ) {
        scanf("%d",(a+i));
    }
    selectionSort(a,n);
    printf("\nAfter sorting , \n");
    printf("\nThe elements are displayed : \n");
    for(int i = 0 ;  i < n ; i++ ) {
        printf("\t%d\n",a[i]);
    }
}
