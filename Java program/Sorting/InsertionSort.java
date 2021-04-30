// implement insertion sort

public class InsertionSort {

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 45, 21, 34, 12, 9, 35, 12 };
        insertionSort(arr, arr.length);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
