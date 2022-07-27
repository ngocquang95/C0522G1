package ss14_sort._sort_study;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {2, 7, 8, 9, 1, -5};

        insertSort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}
