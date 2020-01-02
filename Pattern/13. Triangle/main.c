#include<stdio.h>
int main()
{
    int i , j , k , l;
    int n = 5 ;
    for(i=1; i <= n; i++)
    {
        for(j=1;j<=n-i;j++)
        {
            printf("\t");
        }
        for(k=1;k<=2*i-1;k++)
        {
            printf("*\t");
        }
        printf("\n");
    }
}


/*

bbb*
bb***
b*****
*******

*/