#include "stdio.h"

int main(){

    FILE *fptr;

    // Create a new file if it doesn't exist, or overwrite it if it does
    fptr = fopen("newfile.txt", "w");
    if(fptr == NULL){
        printf("Error opening file for writing!\n");
        return 1;  // Exit if the file couldn't be opened
    }
    fprintf(fptr, "This is how to write content into a file");
    fclose(fptr);

    // Append new content to the existing file
    fptr = fopen("newfile.txt", "a");
    if(fptr == NULL){
        printf("Error opening file for appending!\n");
        return 1;  // Exit if the file couldn't be opened
    }
    fprintf(fptr, "\nThis is how to append new content into an existing file");
    fclose(fptr);


    // Read data from a file
    fptr = fopen("newfile.txt", "r");
    if(fptr == NULL){
        printf("Error reading file!\n");
        return 1;
    }


    char container_string[1000]; // to store the read content
//    ----------
//    fgets(container_string, 1000, fptr); // this way only get first line of the text
//    printf("%s", container_string);
//------------

    while (fgets(container_string, sizeof(container_string), fptr) != NULL){
        printf("%s", container_string); // print each line until the end
    }
    fclose(fptr);

    return 0;
}
