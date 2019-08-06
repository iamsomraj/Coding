#include<stdio.h>
int fib(int n)
{
    if(n==0 || n==1)
    {
        return n;
        
    }
    else
    {
        return(fib(n-1)+fib(n-2));
    }
}
int main()
{
    int i,n = 5;
    for(i=0;i<n;i++)
    {
        printf("\n\n%d\t",fib(i));
    }
}