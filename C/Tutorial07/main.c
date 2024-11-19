#include "stdio.h"

#define PI 3.14

#define countUP for (int i = 0; i <=10; i++){ printf("%d\n", i); }

#define Area length*width

#define circle_area PI*radius*radius
#define circumference 2*PI*radius

int main(){

    int radius = 7;
    int length = 10, width = 5;

    countUP;

    printf("\nThe area = %d\n", Area);
    printf("The area of circle = %f\n", circle_area);
    printf("The circumference = %f", circumference);
    return 0;
}