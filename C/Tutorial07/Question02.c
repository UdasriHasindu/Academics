#include "stdio.h"

struct Mark{
    int stu_Num;
    char stu_name[30];
    float gpa;
};

int main(){

    FILE *mptr, *newptr;

    mptr = fopen("mark.dat", "r");
    if(mptr == NULL){
        printf("The file cannot be opened");
        return 1;
    }

    return 0;
}
