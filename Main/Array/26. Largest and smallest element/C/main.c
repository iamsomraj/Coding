#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("\nEnter the number of elements:");
    scanf("%d", &n);
    int *arr;
    printf("\nEnter the elements one by one:");

    arr = (int *)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++)
    {
        scanf("%d", arr + i);
    }

    int max = arr[0] < arr[1] ? arr[1] : arr[0];
    int smax = max - 1;
    int min = arr[0] < arr[1] ? arr[0] : arr[1];
    int smin = min + 1;

    for (int i = 0; i < n; i++)
    {
        if (max < *(arr + i))
        {
            smax = max;
            max = arr[i];
        }
        else if (smax < *(arr + i) && *(arr + i) != max)
        {
            smax = arr[i];
        }
        if (min > arr[i])
        {
            smin = min;
            min = arr[i];
        }
        else if (smin > arr[i] && arr[i] != min)
        {
            smin = arr[i];
        }
    }

    printf("\nMaximum Element is %d", max);
    printf("\nMinimum Element is %d", min);
    printf("\nSecond Maximum Element is %d", smax);
    printf("\nSecond Minimum Element is %d", smin);
}
