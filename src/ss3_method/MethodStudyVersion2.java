package ss3_method;

import java.util.Scanner;

public class MethodStudyVersion2 {
    public static void main(String[] args) {
        //S = b! + b! + c!
        //B1: Nhập vào b (b >= 0), b (b >= 0), c (c >= 0)
        //B2: Tính giai thừa của b, b, c
        //B3: Tính tổng

        MethodStudyVersion2 temp = new MethodStudyVersion2();

        Scanner scanner = new Scanner(System.in);
        int a = temp.inputPositive("a");
        int b = temp.inputPositive("b");
        int c = temp.inputPositive("c");

        long factorialA = temp.calculateFactorial(a);
        long factorialB = temp.calculateFactorial(b);
        long factorialC = temp.calculateFactorial(c);

        long sum = factorialA + factorialB + factorialC;

        System.out.printf("S = %d! + %d! + %d! = %d", a, b, c, sum);
    }

    long calculateFactorial(int a) {
        long factorialA = 1;
        for (int i = 2; i <= a; i++) {
            factorialA *= i;
        }
        return factorialA;
    }

    int inputPositive(String target) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isInvalidN;
        do {
            // Menu
            System.out.printf("Nhập vào %s: ", target);
            n = scanner.nextInt();

            isInvalidN = n < 0;

            if (isInvalidN) {
                System.out.printf("%s >= 0, xin kiểm tra lại!!!\n", target);
            }
        } while (isInvalidN);
        return n;
    }
}
