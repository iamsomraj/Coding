#include<stdio.h>
int main(int a , char *b[])
{
    int i, n=0, m = 0;
    for(i = 0; b[2][i] != '\0'; i++)
    {
        n = n * 10 + (b[2][i] - '0');
    }
    for(i = 0; b[1][i] != '\0'; i++)
    {
        m = m * 10 + (b[1][i] - '0');
    }
    int p=1;
    for(i=1; i<=n; i++)
    {
        p = p * m;
    }
 
    printf("\n\nThe result of power(%d,%d) is %d\n",m,n,p);
}