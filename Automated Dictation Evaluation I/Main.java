#include<stdio.h>
#include<string.h>

int main()
{
    char a[100], b[100];    
        
    gets(a);    

      
    gets(b);
    
    if( strcmp(a,b) == 0 )
        printf("It is correct\n");
    else
        printf("It is wrong\n");
        return 0;
}
