#include<stdio.h>
#include<string.h>

int main()
{
    char str[100];
    printf("\n\nEnter the string: ");
    scanf("%[^\n]s",str);
    strupr(str);
    
        for(int i=0; i<strlen(str)-1; i++ )
        {
            for(int j=0; j<strlen(str)-i-1; j++)
            {
                int temp;
                if(str[j]>str[j+1])
                {
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                        
                }
            }
        }
        
        printf("\n\nThe sorted string is: %s\n\n",str);
 
}
