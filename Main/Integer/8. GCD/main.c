#include<stdio.h>
int gcd(int a, int b)
{
    
    if(b>a)
    {
        a=a^b;
        b=a^b;
        a=a^b; 
    }
    
    if(b!=0)
    {
        return(gcd(b,a%b));
    }
    else
    {
        return(a);
    }
}

int main()
{
    int a = 366 , b = 6;
    
    printf("\n\nThe GCD of Number %d and %d is %d\n\n",a,b,gcd(a,b));
}