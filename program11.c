#include<stdio.h>
#include<stdlib.h>

int main()
{
        int no = 0;

        printf("Enter Number    :\n");
        if(scanf("%d",&no)!= 1)
        {
                printf("Invalide input");

                return EXIT_FAILURE;
        }

        printf("Input is Valid\n");
        return EXIT_SUCCESS;
}