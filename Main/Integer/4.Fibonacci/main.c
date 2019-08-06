#include<stdio.h>
int main(int argc, char* argv[])
{
    int a = 0 , b = 1, sum = 0, i , n = 0;
    for(i =0 ;argv[1][i] != '\0'; i++)
    {
        n = n * 10 + (argv[1][i] - '0');
    }
    printf("\n\nThe first %d terms of fibonacci series are: ", n);
    while(n!=0)
    {
        printf("\n\n%d",sum);
        sum = a + b;
        a = b;
        b = sum;
        n--;
    }
}