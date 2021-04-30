// implement bubble sort

public class BubbleSort {

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 45, 21, 34, 12, 9, 35, 12 };
        bubbleSort(arr, arr.length);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
