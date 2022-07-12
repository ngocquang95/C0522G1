package ss8_clean_code.mvc.service.impl;

import ss8_clean_code.mvc.model.Person;
import ss8_clean_code.mvc.model.Student;
import ss8_clean_code.mvc.model.Teacher;
import ss8_clean_code.mvc.service.IPersonService;

public class PersonService implements IPersonService {
    // hard code
    public static Person[] people;
    public static int count; // số lượng thực sự

    static {
        count = 3;
        people = new Person[1000];
        people[0] = new Student(1, "Tấn Huân", 1.5);
        people[1] = new Student(2, "Thủy Tiên", 8);
        people[2] = new Teacher(2, "Thảo", 8);
    }

    @Override
    public void findAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(people[i]);
        }

//        for (int i = 0; i < people.length; i++) {
//            if (people[i] != null) {
//                System.out.println(people[i]);
//            }
//        }
    }
}
