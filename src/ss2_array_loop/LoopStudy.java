package ss2_array_loop;

import java.util.Scanner;

public class LoopStudy {
    public static void main(String[] args) {
        // For
        int n = 10;
        // in từ 1 đến 10
// for (giá trị khởi tạp; điều kiện để chạy tiếp; bước lặp)
//        for (int i = 0; i < n; i++) {
//            System.out.print(i + "\t");
//        }
//
//        // while
//        int i = 0;
//        while (i < n) {
//            System.out.print(i + "\t");
//            i++;
//        }
//        int i = 0;
//        while (true) {
//            i++;
//            System.out.println(i); // 1, 3
//            if (i % 2 == 0) {
//                continue;
//            }
//
//            if (i == 5) {
//                break;
//            }
//        }

        // do-while
        // score [0;10]
        Scanner scanner = new Scanner(System.in);
        double score;
        boolean isInvalidScore;
        do {
            // Menu
            System.out.print("Nhập vào điểm của bạn: ");
            score = scanner.nextDouble();

            isInvalidScore = score < 0 || score > 10;

            if (isInvalidScore) {
                System.out.println("Điểm chỉ được phép [0;10], xin kiểm tra lại!!!");
            }
        } while (isInvalidScore);

        System.out.println("Điểm của bạn là: " + score);
    }
}
