#include<stdio.h>
int main(int argc, char* argv[])
{
    int n = 0, temp, i  ; 
    int sum = 0;
    for( i = 0; argv[1][i] != '\0'; i++)
    {
        n = n * 10 + (argv[1][i]-'0');
    }
    temp = n;
    while(temp>0)
    {
        int rem = temp % 10;
        sum = sum * 10 + rem;
        temp = temp / 10 ;
    }
    
    printf("\n\nThe reverse of %d is - %d", n , sum);
    
}