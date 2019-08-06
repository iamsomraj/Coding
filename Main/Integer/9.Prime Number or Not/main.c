#include<stdio.h>
int isPrime(int n)
{
    int i;
    for(i = 2; i <= n/2; i++)
    {
        if(n%i != 0)
        {
            continue;
        }
        return 0;
    }
    
    return 1;
}


int main(int argc, char* argv[])
{
    int n=0, i  ;
    for(i = 0; argv[1][i] != '\0'; i++)
    {
        n = n * 10 + (argv[1][i]-'0');
    }
    if(isPrime(n))
    {
        printf("\n\nThe number %d is prime\n",n);
    }
    else
    {
        printf("\n\nThe number %d is not prime\n",n);

    }
}