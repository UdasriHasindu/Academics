#include "stdio.h"


// student structure
typedef struct {
    int studentNO;
    char name[25];
    char department[20];
    int joinedYear;
}student;

// To input student details
void inputDetails(student *stptr){

    printf("Enter the student number:\n");
    scanf("%d", &stptr->studentNO);

    printf("Enter the name:\n");
    scanf("%[^\n]", stptr->name);
}


int main(){

    return 0;
}