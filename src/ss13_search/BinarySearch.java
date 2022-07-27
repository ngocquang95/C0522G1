package ss13_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int k = 5000;
        System.out.println(binarySearch(a, 0, a.length - 1, k));
    }

    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (x == arr[mid]) {
                return mid;
            }

            if (x > arr[mid]) {
                return binarySearch(arr, mid + 1, right, x);
            }

            return binarySearch(arr, left, mid - 1, x);
        }

        return -1;
    }
}
