package ss2_array_loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndLoop {
     void main(String[] args) {
        // Nhập vào mảng 1 chiều
//        Scanner scanner = new Scanner(System.in);
//        int n;
//        boolean isInvalidLength;
//        do {
//            // Menu
//            System.out.print("Nhập vào số lượng phần tử: ");
//            n = scanner.nextInt();
//
//            isInvalidLength = n < 0 || n > 10;
//
//            if (isInvalidLength) {
//                System.out.println("n >=0, xin kiểm tra lại!!!");
//            }
//        } while (isInvalidLength);
//
//        System.out.println("Điểm của bạn là: " + n);
//
//        int[] arr = new int[n];
//
//        //Nhập mảng
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Nhập vào a[%d]: ", i);
//            arr[i] = scanner.nextInt();
//        }
//
//        // xuất mảng
////        for (int i = 0; i < arr.length; i++) {
////            System.out.printf(arr[i] + "\t");
////        }
//        System.out.println(Arrays.toString(arr)); // phương thức có sẵn của java
//
//        for(int item : arr) {
//            System.out.printf(item + "\t");
//        }


        int[][] arr7 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7}};
        for (int i = 0; i < arr7.length; i++) { // duyệt qua các hàng
            for (int j = 0; j < arr7[i].length; j++) {
                System.out.print(arr7[i][j] + "\t");
            }
            System.out.println();
        }

        int a[] = new int[]{1, 3};

        // Mảng có 10 phần tử
        // => xóa phần tử tại vị trí số 2

        // Bước 1
        // Dùng vòng for để dán giá trị lại

        // Bước 2
        // new ra mảng mới có sống lượng phần tử là n - 1 = 9

        // Bước 3
        // copy giá trị từ mảng cũ qua mảng mới

        // bước 4
        // gián lại địa chỉ cho mảng cũ

        // so sánh
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        int x = 2;
        // vì sao không sử dụng equals cho kiểu dữ liệu nguyên thủy???
    }
}
