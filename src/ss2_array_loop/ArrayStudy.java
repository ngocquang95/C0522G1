package ss2_array_loop;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] arr, b; // khai báo => java dùng cách này như một lựa chọn mặc định
        int arr2[], b2; // khai báo
        //b đang là mảng 1 chiều
        // b2 biến kiểu int

//        String arr3[]; //

        // cách khai báo thứ 1 => thông qua từ khóa new
        int[] arr3 = new int[] {1, 2, 3, 4, 5}; // khai báo và khởi tạo mảng
        int[] arr4; // khai báo
        arr4 = new int[] {1, 2, 3, 4, 5};  // khởi tạo

        int[] arr5 = {1, 2, 3, 4, 5}; // cách khai báo thứ 2
        int[] arr6;
        arr6 = new int[] {1, 2, 3, 4, 5};
        // Khi khởi tạo sau thì bắt buộc phải sử dụng từ khóa new

//        arr6.length
//        System.out.println(arr6[5]);

        //int[hàng][cột]
        int[][] arr7 = new int[][] {{1, 2, 3}, {4, 5}, {6, 7}};

        System.out.println(arr7[1].length);
    }
}
