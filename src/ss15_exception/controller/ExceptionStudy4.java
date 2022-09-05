package ss15_exception.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionStudy4 {
    public static void main(String[] args) {
        readFlie();
    }

    static void readFlie() {
        File file = new File("src/ss15_exception/file/em2.txt");
//        try {
        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader(file);
////            int x = 1/0;
////            try {
////                fileReader.close();
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("Không tìm thấy file");
////            return;
//            System.exit(0);
//        } finally {
//            if (fileReader != null) {
//                try {
//                    fileReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Luôn luôn được thực hiện");
//            }
//        }
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        }

        System.out.println("Chương trình kết thúc không lỗi lầm");

        File file1 = new File("src/ss15_exception/file/em.txt");
        try {
            FileReader fileReader1 = new FileReader(file1);
            System.out.println("Tìm thấy file");
            fileReader1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
