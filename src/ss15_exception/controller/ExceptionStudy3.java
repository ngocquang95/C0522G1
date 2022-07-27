package ss15_exception.controller;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudy3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm của bạn: ");

        int score = 0;
        while (true) {
            try {
                System.out.println("line 15");
                score = Integer.parseInt(scanner.nextLine()); // abc
                score = score / 0;
                System.out.println("line 17");
                break;
            } catch (ArithmeticException e) {
                System.out.println("Đang chia cho 0");
            } catch (NumberFormatException e) {
//                scanner.nextLine();//xóa dữ liệu ở trong scanner => không cần vì ở line 17 đã dùng scanner.nextLine()
                System.out.println("Bạn phải nhập vào số, xin hãy nhập lại!!!");
            } catch (Exception e) {
                System.out.println("Ngoại lệ chưa ngờ tới");
            }
        }

        System.out.println("Điểm của bạn là: " + score);

        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
