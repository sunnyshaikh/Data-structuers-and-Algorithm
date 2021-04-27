// Write a program to calculate the total bill tax amount for a list of billing amounts passed as an array of long integers. Up to the amount 1000, there is no tax applicable, subsequently, a flat tax of 10% is applicable for the remaining amount as per the tax rate.

#include <bits/stdc++.h>
using namespace std;

class solution
{
public:
    int getTaxAmt(long arr[], int n)
    {
        long tax = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 1000)
            {
                tax += (arr[i] / 10) - 100;
            }
        }

        return tax;
    }
};

int main()
{
    long arr[] = {1000, 2000, 3000, 4000, 5000};
    int size = sizeof(arr) / sizeof(arr[0]);

    solution ob;
    cout << ob.getTaxAmt(arr, size);

    return 0;
}