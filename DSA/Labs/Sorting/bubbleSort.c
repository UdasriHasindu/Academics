#include <stdio.h>

#define len(arr) sizeof(arr) / sizeof(int)

int main()
{

    int arr[5] = {15, 16, 6, 8, 5};

    int n = len(arr);

    for (int i = 0; i < n - 1; i++)
    {
        int flag = 0;
        for (int j = 0; j < n - 1 - i; j++)
        {

            if (arr[j] > arr[j + 1])
            {
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                flag = 1;
            }
        }
        if (flag == 0)
        {
            break;
        }
    }

    // print sorted array
    for (int i = 0; i < len(arr); i++)
    {
        printf("%d ", arr[i]);
    }
}