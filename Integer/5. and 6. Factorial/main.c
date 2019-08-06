#include<stdio.h>
int factorial (int n)
{
    if( n == 0 || n == 1)
    {
        return n;
    }
    else
    {
        return(n*factorial(n-1));
    }
}
int main()
{
    int n ; 
    printf("\n\nEnter the number : ");
    scanf("%d",&n);
    printf("\n\nThe factorial of %d is %d",n,factorial(n));
    
}