package ss3_method;

import java.util.Scanner;

public class MethodStudy {
    public static void main(String[] args) {
        //S = b! + b! + c!
        //B1: Nhập vào b (b >= 0), b (b >= 0), c (c >= 0)
        //B2: Tính giai thừa của b, b, c
        //B3: Tính tổng

        Scanner scanner = new Scanner(System.in);
        int a;
        boolean isInvalidA;
        do {
            // Menu
            System.out.print("Nhập vào a: ");
            a = scanner.nextInt();

            isInvalidA = a < 0;

            if (isInvalidA) {
                System.out.println("a >= 0, xin kiểm tra lại!!!");
            }
        } while (isInvalidA);

        int b;
        boolean isInvalidB;
        do {
            // Menu
            System.out.print("Nhập vào b: ");
            b = scanner.nextInt();

            isInvalidB = b < 0;

            if (isInvalidB) {
                System.out.println("b >= 0, xin kiểm tra lại!!!");
            }
        } while (isInvalidB);

        int c;
        boolean isInvalidC;
        do {
            // Menu
            System.out.print("Nhập vào c: ");
            c = scanner.nextInt();

            isInvalidC = c < 0;

            if (isInvalidC) {
                System.out.println("c >= 0, xin kiểm tra lại!!!");
            }
        } while (isInvalidC);

        long factorialA = 1;
        for (int i = 2; i <= a; i++) {
            factorialA *= i;
        }
        long factorialB = 1;
        for (int i = 2; i <= b; i++) {
            factorialB *= i;
        }
        long factorialC = 1;
        for (int i = 2; i <= c; i++) {
            factorialC *= i;
        }

        long sum = factorialA + factorialB + factorialC;

        System.out.printf("S = %d! + %d! + %d! = %d", a, b, c, sum);
    }
}
