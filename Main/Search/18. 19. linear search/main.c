#include<stdio.h>
int main()
{
    int a[100] = {10, 
                  30, 60, 80, 90, 56, 45, 87, 15};
    int i ;
    int n=sizeof(a)/sizeof(a[0]);
    printf("\n\nEnter the element to search: ");
    int key;
    scanf("%d",&key);
    int flag = 0,pos;
    for(i=0;i<n;i++)
    {
        if(a[i]==key)
        {
            flag = 1;
            pos = i;
            break;
        }
    }
    
    if(flag==0)
    {
        printf("\n\nThe Element does not exist!");
    }
    else
    {
        printf("\n\nThe element %d exists at position: %d ",key,pos+1);

    }
    
}