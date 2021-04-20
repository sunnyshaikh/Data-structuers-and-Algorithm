// C program to find the Minimum and Maximum elemnt from an Array

#include <stdio.h>
#include <limits.h>

void minmax(int arr[], int size, int *a, int *b)
{
    int min = INT_MAX;
    int max = 0;

    for (int i = 0; i < size; i++)
    {
        if (arr[i] < min)
            min = arr[i];
        if (arr[i] > max)
            max = arr[i];
    }

    *a = min;
    *b = max;
}

int main()
{
    //code
    int arr[] = {1000, 11, 445, 10, 330, 3000};
    int size = sizeof(arr) / sizeof(arr[0]);

    int min = 0;
    int max = 0;

    minmax(arr, size, &min, &max);

    printf("%d %d", min, max);

    return 0;
}