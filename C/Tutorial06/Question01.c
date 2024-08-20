#include <stdio.h>

struct complex_numbers{
    int real;
    int imaginary;
};

// take complex number real and imaginary parts using pointer to structure
void input(struct complex_numbers *x){
    printf("Enter the real part of complex number:\n");
    scanf("%d", &x->real);
    printf("Enter the imaginary part of complex number:\n");
    scanf("%d", &x->imaginary);
}

// take 3 pointers, two as arguments one as result
//
void sum(struct complex_numbers *a, struct complex_numbers *b, struct complex_numbers *p){
    p->real = a->real + b->real;
    p->imaginary = a->imaginary + b->imaginary;
}

void product(struct complex_numbers *a, struct complex_numbers *b, struct complex_numbers *p){

    p->real = (a->real * b->real) - (a->imaginary * b->imaginary);
    p->imaginary = (a->real * b->imaginary) + (a->imaginary * b->real);
}

void quotient(struct complex_numbers *a, struct complex_numbers *b, struct complex_numbers *p){

    double divisor = ((b->real * b->real) + (b->imaginary * b->imaginary));
    p->real = ((a->real * b->real) + (a->imaginary * b->imaginary)) / divisor;
    p->imaginary = ((a->imaginary * b->real) - (a->real * b->imaginary)) / divisor;
}

void showResults(struct complex_numbers *p){
    printf("result = (%d + %di)\n", p->real, p->imaginary);
}

int main(){
    printf("Complex Number Calculation\n\n");

    struct complex_numbers num1, num2, result_sum, result_pr, result_qu ;

    printf("Enter real & imaginary parts of 1st complex number:\n");
    scanf("%d %d", &num1.real, &num1.imaginary);

    printf("Enter real & imaginary parts of 2nd complex number:\n");
    scanf("%d %d", &num2.real, &num2.imaginary);

    // function parameter except pointers, so give the address of the variables
    // Summation
    sum(&num1, &num2, &result_sum);
    printf("Summation ");
    showResults(&result_sum);

    // Multiplication
    product(&num1, &num2, &result_pr);
    printf("Multiplication ");
    showResults(&result_pr);

    // Division
    product(&num1, &num2, &result_qu);
    printf("Division ");
    showResults(&result_qu);

    return 0;
}