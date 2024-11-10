#include <stdio.h>
#include <stdbool.h>

#define QUEUESIZE 10

typedef int QueueType;

typedef struct
{
    QueueType queueArray[QUEUESIZE];
    int front;
    int rear;
    int count;
} Queue;

// function definitions
void createQueue(Queue *q);
bool isQueueEmpty(Queue *q);
bool isQueueFull(Queue *q);
void enqueue(Queue *q, QueueType item);
void dequeue(Queue *q, QueueType *garbage);
void displayQueue(Queue *q);
void peek(Queue *q);


int main(){

    Queue q;
    QueueType garbageValue;

    createQueue(&q);
    enqueue(&q, 8);
    enqueue(&q, 16);
    enqueue(&q, 32);
    enqueue(&q, 64);

    printf("Display queue\n");
    displayQueue(&q);

    printf("\nDequeue operation\n");
    dequeue(&q,&garbageValue);
    printf("served: %d\n", garbageValue);
    dequeue(&q,&garbageValue);
    printf("served: %d\n", garbageValue);

    printf("\nPeek operation, front value is: ");
    peek(&q);


    return 0;
}

// function declaration
void createQueue(Queue *q)
{
    q->rear = -1;
    q->front = 0;
    q->count = 0;
}

bool isQueueEmpty(Queue *q)
{
    return (q->rear == -1);
}

bool isQueueFull(Queue *q)
{
    return (q->rear == QUEUESIZE - 1);
}

void enqueue(Queue *q, QueueType item)
{
    if (isQueueFull(q))
    {
        printf("Queue overflow");
    }
    else
    {
        (q->rear)++;
        q->queueArray[q->rear] = item;
        q->count++;
    }
}

void dequeue(Queue *q, QueueType *garbage)
{
    if (isQueueEmpty(q))
    {
        printf("Queue Underflow");
    }
    else if (q->rear == q->front)
    {
        q->rear = -1;
        q->front = 0;
    }
    else
    {
        *garbage = q->queueArray[q->front];
        (q->front)++;
        (q->count)--;
    }
}

void displayQueue(Queue *q)
{
    if (isQueueEmpty(q))
    {
        printf("Queue is empty");
    }
    else
    {
        for (int i = q->front; i <= q->rear; i++)
        {
            printf("%d \n", q->queueArray[i]);
        }
    }
}

void peek(Queue *q)
{
    printf("Front value: %d", q->queueArray[q->front]);
}