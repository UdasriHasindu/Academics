#include <stdio.h>
#include <stdbool.h>

#define DEQUESIZE 10

typedef struct {
    int front, rear;
    char dequeArray[DEQUESIZE];
} Deque;

// Initialize the Deque
void createDeque(Deque *d) {
    d->front = -1;
    d->rear = -1;
}

// Check if Deque is full
bool isDequeFull(Deque *d) {
    return (d->front == 0 && d->rear == DEQUESIZE - 1) || (d->rear + 1 == d->front);
}

// Check if Deque is empty
bool isDequeEmpty(Deque *d) {
    return (d->front == -1);
}

// Append element to the front of Deque
void appendFront(Deque *d, char item) {
    if (isDequeFull(d)) {
        printf("Deque Overflow\n");
    } else {
        if (d->front == -1) {  // First insertion
            d->front = d->rear = 0;
        } else if (d->front == 0) {  // Wrap around if needed
            d->front = DEQUESIZE - 1;
        } else {
            d->front--;
        }
        d->dequeArray[d->front] = item;
        printf("Inserted %c at front of deque\n", item);
    }
}

// Display contents of the Deque
void displayDeque(Deque *d) {
    if (isDequeEmpty(d)) {
        printf("Deque is empty\n");
    } else {
        printf("Deque contents:\n");
        int i = d->front;
        while (true) {
            printf("%c ", d->dequeArray[i]);
            if (i == d->rear) break;
            i = (i + 1) % DEQUESIZE;
        }
        printf("\n");
    }
}

int main() {
    Deque D;
    createDeque(&D);

    char arr[10] = {'P', 'M', 'O', 'J', 'K', 'C', 'D', 'Z'};

    for(int i=0; i< 8; i++){
        appendFront(&D, arr[i]);
    }

    // Insert initial elements: C, K, J, O, M, P
    // appendFront(&D, 'P');
    // appendFront(&D, 'M');
    // appendFront(&D, 'O');
    // appendFront(&D, 'J');
    // appendFront(&D, 'K');
    // appendFront(&D, 'C');

    // // Insert symbols D and Z at the front in a loop
    // appendFront(&D, 'D');
    // appendFront(&D, 'Z');

    // // Display the final deque
    // displayDeque(&D);

    return 0;
}
