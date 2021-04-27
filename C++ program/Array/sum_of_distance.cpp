//  Program to calculate and return the sum of distances between the adjacent number in an

#include <bits/stdc++.h>
using namespace std;

class solution
{
public:
    int findSum(int arr[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n - 1; i++)
        {
            sum += abs(arr[i] - arr[i + 1]);
        }

        return sum;
    }
};

int main()
{
    int arr[] = {10, 11, 7, 12, 14};
    int size = sizeof(arr) / sizeof(arr[0]);

    solution ob;

    cout << ob.findSum(arr, size);

    return 0;
}