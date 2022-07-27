package ss15_exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudy2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm của bạn: ");

        double score = 0;
        while (true) {
            try {
                System.out.println("line 15");
                score = scanner.nextDouble(); // abc
                System.out.println("line 17");
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();//xóa dữ liệu ở trong scanner
                System.out.println("Bạn phải nhập vào số, xin hãy nhập lại!!!");
            }
        }

        System.out.println("Điểm của bạn là: " + score);

        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
