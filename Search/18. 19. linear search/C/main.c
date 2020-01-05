#include<stdio.h>
int main()
{
    int i,n;
    printf("\nEnter the number of elements: \n");
    scanf("%d",&n);
    printf("\nEnter the elements one by one: \n");
    int a[n];
    for(i=0; i<n; i++){
        scanf("%d",&a[i]);
    }
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
