#include<stdio.h>
#include<stdlib.h>

int main()
{
    char sName[30];

    printf("Enter your Name :\n");
    scanf("%[^'\n']s",sName);

    printf("Welcome %s\n",sName);

    return EXIT_SUCCESS;
}