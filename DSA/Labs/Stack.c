#include <stdio.h>
#include <stdbool.h>

#define STACKSIZE 5

typedef struct
{
    int top;
    int stackArray[STACKSIZE];
} Stack;

// function definition
void createStack(Stack *s);
bool isStackEmpty(Stack *s);
bool isStackFull(Stack *s);
void push(Stack *s, int item);
void pop(Stack *s);
void peek(Stack *s);
void displaStack(Stack *s);

int main()
{

    Stack newStack;
    createStack(&newStack);

    push(&newStack, 5);
    push(&newStack, 10);
    push(&newStack, 15);
    push(&newStack, 20);
    push(&newStack, 25);

    printf("\nStack:\n");
    displaStack(&newStack);

    peek(&newStack);

    printf("\npop operation\n");
    pop(&newStack);
    pop(&newStack);

    printf("\nAfter popping, stack:\n");
    displaStack(&newStack);

    return 0;
}

// function declaration

void createStack(Stack *s)
{
    s->top = -1;
    //create stack with top initialize to 0. to start from the bottom
}

bool isStackEmpty(Stack *s)
{
    return (s->top == -1);
    // return 1 if stack is empty 
}

bool isStackFull(Stack *s)
{
    return (s->top == STACKSIZE - 1);
    // return 1 if stack is full 

}

void push(Stack *s, int item)
{

    if (isStackFull(s))
    {
        printf("Stack Overflow");
    }
    else
    {
        (s->top)++;
        s->stackArray[s->top] = item;
    }
}

void pop(Stack *s)
{
    if (isStackEmpty(s))
    {
        printf("Stack Underflow");
    }
    else
    {
        printf("Item removed: %d\n", s->stackArray[s->top]);
        (s->top)--;
    }
}

void peek(Stack *s)
{
    if (isStackEmpty(s))
    {
        printf("Nothing in the stack");
    }
    else
    {
        printf("Top item is: %d", s->stackArray[s->top]);
    }
}

void displaStack(Stack *s)
{
    for (int i = s->top; i >= 0; i--)
    {
        printf("%d \n", s->stackArray[i]);
    }
}