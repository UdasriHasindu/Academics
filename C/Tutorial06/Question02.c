#include <stdio.h>

typedef struct {
    char brand[25];
    long int brand_code;
    int quantity;
    int stock_count;
    float price;
} soap_in_shop;


void new_soap(soap_in_shop *shoptr){

    printf("Enter the brand name:\n");
    fgets(shoptr->brand, sizeof(shoptr->brand), stdin);

    printf("Enter the brand code:\n");
    scanf("%ld", &shoptr->brand_code);

    printf("Enter the quantity:\n");
    scanf("%d", &shoptr->quantity);

    printf("Enter the price:\n");
    scanf("%f", &shoptr->price);
}


int main(void) {
    printf("Soap shop\n");
     soap_in_shop n1;

    new_soap(&n1);
    return 0;
}
