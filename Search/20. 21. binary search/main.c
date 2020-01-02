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
    int a[10] = {10,20,30,40,50,60,70,80,90}; //Sorted binary list
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