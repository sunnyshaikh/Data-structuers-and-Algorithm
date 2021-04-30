// implement selection sort

public class SelectionSort {

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 45, 21, 34, 12, 9, 35, 12 };
        selectionSort(arr, arr.length);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
