#include<stdio.h>
typedef struct complex
{
    int arr[2];
}complex;

void display(complex a)
{
    printf("\n\nThe value complex number is: ( %d + %di )\n\n",a.arr[0],a.arr[1]);
}

complex create()
{
    int real, imag;
    printf("\n\nEnter the real part of the complex number:\n\n");
    scanf("%d",&real);
    printf("\n\nEnter the imaginary part of the complex number:\n\n");
    scanf("%d",&imag);
    
    complex new;
    new.arr[0]=real;
    new.arr[1]=imag;
    
    return new;
    
}
void addition()
{
    printf("\n\nWelcome to Complex Addition\n\n");

    complex a , b, c;
    
    a = create();
    
    b = create();
    
    c.arr[0] = a.arr[0] + b.arr[0];
    c.arr[1] = a.arr[1] + b.arr[1];
    
    display(c);
    
    
}
void substraction()
{
    printf("\n\nWelcome to Complex Substraction\n\n");

    complex a , b, c;
    
    a = create();
    
    b = create();
    
    c.arr[0] = a.arr[0] - b.arr[0];
    c.arr[1] = a.arr[1] - b.arr[1];
    
    display(c);
}
void multiplication()
{
    printf("\n\nWelcome to Complex Multiplication\n\n");

    complex a , b, c;
    
    a = create();
    
    b = create();
    
    c.arr[0] = a.arr[0] * b.arr[0] - a.arr[1] * b.arr[1];
    c.arr[1] = a.arr[0] * b.arr[1] + a.arr[1] * b.arr[0]; 
    
    display(c);
}



int main()
{
    int ch;
    do
    {
        printf("\n\n\nEnter the choice\n1.Addition\n2.Substraction\n3.Multiplication\n4.Exit\n\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
                addition();
                break;
            case 2:
                substraction();
                break;
            case 3:
                multiplication();
                break;
        } 
    }while(ch!=4);
}