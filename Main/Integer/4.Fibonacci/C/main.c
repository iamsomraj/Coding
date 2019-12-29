#include<stdio.h>
int main(int argc, char* argv[]) {
    int number = 0, i;
    for( i = 0; argv[1][i] != '\0'; i++) {
        number = number * 10 + (argv[1][i] - '0');
    }
    int sum = 1, a = 0 , b = 1;
    printf("\n\nThe first %d terms of fibonacci series are ", number);
    while(number!=0){
        printf("\n%d",a);
        a = b;
        b = sum;
        sum = a + b;
        number--;
    }
}
