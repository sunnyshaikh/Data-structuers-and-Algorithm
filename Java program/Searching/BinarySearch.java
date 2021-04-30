// Implement binary search algorithm

import java.util.*;

class Solution {
    public boolean binary_search(int[] arr, int n, int k) {
        // to perform binary we first sort the array
        Arrays.sort(arr);

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == k)
                return true;
            else if (arr[mid] < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 18, 2, 5, 9, 20 };

        Solution ob = new Solution();
        System.out.println(ob.binary_search(arr, arr.length, 20) ? "Element found" : "Element not found");
        System.out.println(ob.binary_search(arr, arr.length, 100) ? "Element found" : "Element not found");
    }
}
