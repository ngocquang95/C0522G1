package ss14_sort.controller;


import ss14_sort.service.IStudentService;
import ss14_sort.service.impl.StudentService;

import java.util.Scanner;

public class MainController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        IStudentService iStudentService = new StudentService();
        System.out.println("1. Sắp xếp theo tuổi với thuật toán sắp xếp nổi bọt");
        System.out.println("2. Sắp xếp theo tuổi với thuật toán sắp xếp chèn");
        System.out.println("3. Sắp xếp theo tuổi với thuật toán sắp xếp chọn");
        System.out.print("Mời người dùng lựa chọn chức năng");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                iStudentService.bubbleSort();
                break;
            case 2:
                iStudentService.insertSort();
                break;
            case 3:
                iStudentService.selectSort();
                break;
        }
    }
}
