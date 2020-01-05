#include<stdio.h>
int bin(int a[], int low, int high, int key)
{
    int mid;
    if(low<=high)
    {
        mid = (low + high) / 2;
        if(a[mid]==key)
        {
            return mid;
        }
        else if(a[mid]>=key)
        {
            return(bin(a,low,mid-1,key));
        }
        else
        {
            return(bin(a,mid+1,high,key));
        }
    }
    return -1;

}
int main()
{
    int l;
    int a[10] = {0,10,20,30,40,50,60,70,80,90}; //Sorted binary list
    printf("\nThe input is a sorted list with 10 elements:\nThe elements are displayed:\n");
    for(l = 0; l<10; l++){
        printf("\t%d",a[l]);
    }
    int n = sizeof(a)/sizeof(a[0]);
    int key ;
    printf("\n\nEnter the element to be searched: ");
    scanf("%d",&key);
    int flag = bin(a,0,n-1,key);
    if(flag==-1)
    {
        printf("\n\nThe key can not be found!");
    }
    else
    {
        printf("\n\nThe key %d is found at positon %d",key,flag+1);
    }
}
