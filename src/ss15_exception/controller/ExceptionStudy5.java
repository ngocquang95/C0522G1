package ss15_exception.controller;

import ss15_exception.exception.AgeException;

public class ExceptionStudy5 {
    public static void main(String[] args) throws AgeException {
        int age = 17;

//        try {
        checkAge(age);
//        } catch (AgeException e) {
////            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }

        System.out.println("Chương trình kết thúc không lỗi lầm");
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 18 || age > 100) {
            throw new AgeException("Bạn chưa đủ tuổi");
        }
    }
}
