#include <stdio.h>
#define ArrayLength 50

// function declarations
void Insertion(int size, int arr[]);
void ShowArray(int arr[], int size);
void InsertIntoPosition(int position, int arr[], int *size, int value);
void Deletion(int position, int arr[], int *size);

int main()
{

    int num[ArrayLength];
    int size = 5;

    Insertion(size, num); // 5 elements will add to num array
    ShowArray(num, size); // 5 elements wiil print in terminal

    printf("\n");
    InsertIntoPosition(3, num, &size, 12); // will insert the 12 at possition 3, size of array will increase by one
    ShowArray(num, size);

    printf("\n");
    Deletion(2, num, &size); // delete 2nd position in array, size will decrease
    ShowArray(num, size);


    return 0;
}

// function definitions
void Insertion(int size, int arr[])
{
    for (int i = 0; i < size; i++)
    {
        printf("Enter value for index %d: ", i);
        scanf("%d", &arr[i]);
    }
}

void InsertIntoPosition(int position, int arr[], int *size, int value)
{
    int index = position - 1;

    // Check for invalid position or overflow
    if (position < 1 || position > *size + 1 || *size >= ArrayLength)
    {
        printf("Can't insert, Invalid position or array is full!\n");
    }
    else
    {
        // Shift elements to the right to make space for the new element
        for (int i = *size - 1; i >= index; i--)
        {
            arr[i + 1] = arr[i];
        }

        // Insert the new value at the specified position
        arr[index] = value;
        (*size)++; // Increase the size to reflect the new element

        printf("Value %d inserted at position %d\n", value, position);
    }
}

void ShowArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("value of index %d: %d\n", i, arr[i]);
    }
}

void Deletion(int position, int arr[], int *size)
{
    int index = position - 1;

    if (*size < position || position <= 0)
    {
        printf("Invalid position\n");
    }
    else
    {
        for (int i = index; i < *size - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        (*size)--; // Decrease the size after deletion
        printf("Value at position %d deleted\n", position);
    }
}
