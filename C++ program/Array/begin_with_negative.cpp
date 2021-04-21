// Program to move all negative numbers to beginning and positive to end

#include <iostream>
using namespace std;

class solution
{
public:
    void arrange(int *arr, int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] < 0)
            {
                if (i != j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
};

int main()
{
    int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
    int size = sizeof(arr) / sizeof(arr[0]);

    solution ob;
    ob.arrange(arr, size);

    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";

    return 0;
}

// https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/