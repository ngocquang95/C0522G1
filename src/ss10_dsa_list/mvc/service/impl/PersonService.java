package ss10_dsa_list.mvc.service.impl;

import ss10_dsa_list.mvc.model.Person;
import ss10_dsa_list.mvc.model.Student;
import ss10_dsa_list.mvc.model.Teacher;
import ss10_dsa_list.mvc.service.IPersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonService implements IPersonService {
    // hard code
    public static List<Person> people;

    static {
        people = new ArrayList<>();
        people.add(new Student(1, "Tấn Huân", 9));
        people.add(new Student(2, "Thủy Tiên", 8));
        people.add(new Teacher(2, "Thảo", 8));
    }

    @Override
    public void findAll() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

//        for (int i = 0; i < people.length; i++) {
//            if (people[i] != null) {......
//                System.out.println(people[i]);
//            }
//        }
    }


}
