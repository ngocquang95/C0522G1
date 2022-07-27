package ss13_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10, 20, -4, 10};
        int k = 100;

        System.out.println(linearSearch(a, k));
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }
}
