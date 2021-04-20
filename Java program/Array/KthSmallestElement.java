// Java program to find kth smallest element in an array

import java.util.*;

class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // no. of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // no. of elements in an array
            int[] arr = new int[n]; // array of size n

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int k = sc.nextInt(); // no. to find kth smallest element

            Solution obj = new Solution();
            System.out.println(obj.kthSmallest(arr, k));
        }
        sc.close();
    }
}

// Question from
// (https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1)