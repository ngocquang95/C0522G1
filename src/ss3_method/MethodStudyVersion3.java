package ss3_method;

import java.util.Scanner;

public class MethodStudyVersion3 {
    public static void main(String[] args) {
        // Kiểm tra số nguyên tố n
        //Đếm xong trong mảng có bao nhiêu số nguyên tố
        MethodStudyVersion2 temp = new MethodStudyVersion2();
//
        int n = temp.inputPositive("n");

        int[] arr = {1, 2, 3, 4, 5};

        int count = 0;
        for (int item : arr) {
            if (isPrime3(item)) {
                count++;
            }
        }

        System.out.println("Số lượng số nguyên tố trong mảng: " + count);

        if (isPrime3(n)) {
            System.out.println("n là số nguyên tố");
        } else {
            System.out.println("n không phải là số nguyên tố");
        }
    }

    // Các thiếu nhi
    static void isPrime(int n) {
        if (n < 2) {
            System.out.println("n không phải là số nguyên tố");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("n không phải là số nguyên tố");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("n là số nguyên tố");
            }
        }
    }

    // Các người trưởng thành
    static void isPrime2(int n) {
        if (n < 2) {
            System.out.println("n không phải là số nguyên tố");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("n không phải là số nguyên tố");
                return;
            }
        }
        System.out.println("n là số nguyên tố");
    }

    // Các người từng trải
    static boolean isPrime3(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
