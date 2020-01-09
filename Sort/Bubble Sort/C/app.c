#include<stdio.h>
void bubbleSort(int*,int*);
int main() {
    int n;
    printf("\nEnter the number of the elements : \n");
    scanf("%d",&n);
    int* arr;
    arr = (int *)malloc(n*sizeof(int));
    printf("\nEnter the elements one by one:\n");
    for(int i = 0; i<n ; i++) {
        scanf("%d",(arr+i));
    }

    bubbleSort(arr+0,&n);
}

void bubbleSort(int* arr, int* nn) {
    printf("\nArray : \n");
    printf("\nBubble sort : \n");
    for(int i = 0 ; i < *nn - 1; i++ ) {
        for(int j = 0; j < *nn - i - 1; j++ ) {
            if( *(arr+j) > *(arr+j+1)) {
                // practicing the swapping without third variable
                printf("\n %d > %d \n",*(arr+j),*(arr+j+1));
                *(arr+j) = (*(arr+j) + *(arr+j+1));
                *(arr+j+1) = (*(arr+j)- *(arr+j+1));
                *(arr+j) = (*(arr+j) - *(arr+j+1));
            }
        }
        printf("\nnext pass\n");
    }
    printf("\nThe elements are displayed one by one: \n");
    printf("\nThe order is ascending order: \n");
    for(int i = 0; i < *nn ; i++) {
        printf("\t%d\t",arr[i]);
    }
}
