#include<stdio.h>
int main()
{
    int n;
    printf("\n\nEnter the number of the rows:" );
    scanf("%d",&n);
    int i, j , k , l, arr[50][50];
    
    for(i=1; i<=n; i++)
    {
        for(j=1; j<=n-i; j++)
        {
            printf("\t");
        }
        for(k=1; k<=i; k++)
        {
            if(i==1 || k==i)
            {
                arr[i][k]=1;
            }
            else
            {
                arr[i][k]=(arr[i-1][k])+(arr[i-1][k-1]);
            }
            printf("%d\t\t",arr[i][k]);


            
        }
        printf("\n");
    }
}