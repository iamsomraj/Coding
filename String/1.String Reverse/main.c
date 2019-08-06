#include<stdio.h>
int main(int argc , char* argv[])
{
    char input[100];
    int i = 0, n = 0 , k = 0 , length = 0;
    printf("\n\nThe number of arguements: %d",argc);
    for(i=0 ; argv[1][i] != '\0' ; i++)
    {
        input[i] = argv[1][i];
        length++;
    }
    input[i] = '\0';
    
    char out[100];
    for(i = length - 1; i >= 0; i--)
    {
        out[k] = input[i];
        k++;
    }
    
    out[k] = '\0';
    printf("\n\nInput string is- %s",input);

    printf("\n\nReversed string is- %s",out);
    
}
    