#include<stdio.h>
 void callvalue(int a , int b)
 {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
     
 }
 void callref(int *a , int *b)
 {
    *a = *a ^ *b;
    *b = *a ^ *b;
    *a = *a ^ *b;
 }
int main()
{
    int a = 10, b = 20;
    callvalue(a,b); 
    printf("\n\nThe value of a and b is %d %d respectively \n\n", a, b);
    int aa = 10 , bb = 20;
    callref(&aa,&bb);
    printf("\n\nThe value of aa and bb is %d %d respectively \n\n", aa , bb);
}