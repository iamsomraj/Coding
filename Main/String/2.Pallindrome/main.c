#include<stdio.h>
int main()
{
    char fwd[1000], rev[1000];
    printf("\n\nEnter a string : ");
    scanf("%s",&fwd);
    int i = 0, j = 0, k= 0, length = 0;
    for(i = 0; fwd[i] != '\0'; i++)
    {
        length++;
    }
    for(i = length-1; i >= 0 ; i--)
    {
        rev[k] = fwd[i];
        k++;
    }
    int flag = 1;
    for(i = 0 ; i < length; i++)
    {
        if(fwd[i] == rev[i])
        {
            continue;
        }
        flag = 0;
    }
    if(flag == 1)
    {
        printf("\n\nThe string %s is a pallindrome ",fwd);
    }
    else
    {
        printf("\n\nThe string %s is not a pallindrome ",fwd);
    }

}