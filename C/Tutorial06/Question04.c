#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef struct {
    char month[15];
    int year;
}date;

typedef struct{
    char author[50];
    char title[50];
    float price;
    char publisher[50];
    int quantity;
    date update;
}shop;


void search_book(shop books[], int size){
    char book_title[50];
    char book_author[50];
    int copies;

    printf("Enter the title: ");
    fgets(book_title, sizeof(book_title), stdin);
    book_title[strlen(book_title)-1] = '\0'; // Remove newline character

    printf("Enter the author: ");
    fgets(book_author, sizeof(book_author), stdin);
    book_author[strlen(book_author)-1] = '\0';// Remove newline character


    for(int i = 0; i < size; i++){

        if((strcmp(books[i].title, book_title) == 0) && (strcmp(books[i].author, book_author) == 0)){

            printf("Title: %s\n", books[i].title);
            printf("Author: %s\n", books[i].author);
            printf("Price: %.2f\n", books[i].price);
            printf("Publisher: %s\n", books[i].publisher);
            printf("Quantity: %d\n", books[i].quantity);
            printf("Date: %s %d\n", books[i].update.month,books[i].update.year);
        }
        printf("How many copies do you want: ");
        scanf("%d", &copies);

        if( copies > books[i].quantity){
            printf("Sorry, insufficient amount. We only have %d books", (books[i].quantity));
        }
        else if( copies <= books[i].quantity){
            printf("Your bill is: %.2f", books[i].price * copies);
            books[i].quantity -= copies;
            break;
        }
        else{
            printf("Invalid amount!");
        }
    }

}



int main() {

    shop bookshop[4] = {
            {"Ritchie", "C language", 2565,"PHI", 10, {"May", 1977}},
            {"Kochan", "Programming in C", 1245, "Hayden", 5, {"July", 1993}},
            {"Balagurusamy", "BASIC", 1890, "TMH", 0, {"January", 1984}},
            {"Balagurusamy", "COBOL", 3890, "Macmilan", 25, {"December", 18}}

    };

    search_book(bookshop, 4);

    return 0;
}