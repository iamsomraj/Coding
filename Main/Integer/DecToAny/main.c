#include<stdio.h>
int main()
{
    int n,base;
    printf("\n\nEnter the number:\n\n");
    scanf("%d",&n);
    printf("\n\nEnter the base:\n\n");
    scanf("%d",&base);
    
    int basearray[base];
    
    for(int i=0; i<base; i++)
    {
        if(i>9)
        {
            basearray[i]=i+55;
        }
        else
        {
            basearray[i]=i+48;
        }
    }
    
   
    
    char ans[100];
    int i=0;
    while(n!=0)
    {
        int r = n % base;
        ans[i] = (char)basearray[r];
        n = n/ base;
        i++;
    }
    ans[i] = '\0';
    char ansnew[100];
    int k=0;
    for(int j=i-1; j>=0; j--)
    {
        ansnew[k]=ans[j];
        k++;
    }
    ansnew[k] = '\0';
    printf("\n\nThe answer is %s\n\n",ansnew);
    
    
    
}