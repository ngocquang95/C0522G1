package ss15_exception.controller;

import ss15_exception.exception.AgeException;

public class ExceptionStudy6 {
    public static void main(String[] args) {
        int age = 17;

        checkAge(age);
    }

    public static void checkAge(int age)  {
        if (age < 18 || age > 100) {
            try {
                throw new AgeException("Bạn chưa đủ tuổi");
            } catch (AgeException e) {
//                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
