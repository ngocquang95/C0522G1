package ss14_sort.service.impl;

import ss14_sort.model.Student;
import ss14_sort.service.IStudentService;

public class StudentService implements IStudentService {
    private static Student[] studentList = new Student[5];

    static {
        studentList[0] = (new Student("Huân", 18, "C0522G1", 8));
        studentList[1] = (new Student("Thành", 15, "C0522G1", 8));
        studentList[2] = (new Student("Học", 20, "C0522G1", 8));
        studentList[3] = (new Student("Tý", 19, "C0522G1", 8));
        studentList[4] = (new Student("Tiên", 18, "C0522G1", 8));
    }

    @Override
    public void bubbleSort() {
        boolean isSwap = true;
        for (int i = 0; i < studentList.length && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.length - 1 - i; j++) {
                if (studentList[j].getAge() > studentList[j + 1].getAge()) {
                    Student temp = studentList[j + 1];
                    studentList[j + 1] = studentList[j];
                    studentList[j] = temp;
                    isSwap = true;
                }
            }
        }
    }

    @Override
    public void selectSort() {
        for (int i = 0; i < studentList.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < studentList.length; j++) {
                if (studentList[j].getAge() < studentList[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = studentList[minIndex];
                studentList[minIndex] = studentList[i];
                studentList[i] = temp;
            }
        }
    }

    @Override
    public void insertSort() {
        for (int i = 1; i < studentList.length; i++) {
            Student key = studentList[i];
            int j = i - 1;
            while (j >= 0 && studentList[j].getAge() > key.getAge()) {
                studentList[j + 1] = studentList[j];
                j--;
            }
            studentList[j + 1] = key;
        }
    }
}
