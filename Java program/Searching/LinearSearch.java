// Implement linear search algorithm

class Solution {
    public boolean linear_search(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                return true;
        }
        return false;
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 18, 2, 5, 9, 20 };

        Solution ob = new Solution();
        System.out.println(ob.linear_search(arr, arr.length, 20) ? "Element found" : "Element not found");
        System.out.println(ob.linear_search(arr, arr.length, 100) ? "Element found" : "Element not found");
    }
}