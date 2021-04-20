// Program to sort an array containing only 0s 1s and 2s without using sorting algorithm
// Segregate 0s 1s and 2s

#include <bits/stdc++.h>
using namespace std;

class solution
{
public:
    void sort012(int *arr, int n)
    {
        // initializing counters for 0s 1s and 2s
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        int i; // looping variable

        // counting 0s 1s and 2s
        for (i = 0; i < n; i++)
        {
            if (arr[i] == 0)
                cnt0++;
            if (arr[i] == 1)
                cnt1++;
            if (arr[i] == 2)
                cnt2++;
        }
        i = 0;
        // fill array with 0s 1s and 2s according to counts
        while (cnt0)
        {
            arr[i++] = 0;
            cnt0--;
        }
        while (cnt1)
        {
            arr[i++] = 1;
            cnt1--;
        }
        while (cnt2)
        {
            arr[i++] = 2;
            cnt2--;
        }
    }
};

int main()
{
    int n;
    cin >> n; // no. element in an array;
    int arr[n];
    int i;
    for (i = 0; i < n; i++)
    {
        cin >> arr[i]; // only 0s 1s 2s
    }

    solution ob;
    ob.sort012(arr, n);

    for (i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}

// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1