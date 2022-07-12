package ss8_clean_code.mvc.service.impl;

import ss8_clean_code.mvc.model.Student;
import ss8_clean_code.mvc.service.IStudentService;

public class StudentService implements IStudentService {
    @Override
    public void findAll() {
        for (int i = 0; i < PersonService.count; i++) {
            if (PersonService.people[i] instanceof Student) {
                System.out.println(PersonService.people[i]);
            }
        }
    }
}
