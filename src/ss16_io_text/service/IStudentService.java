package ss16_io_text.service;

import ss16_io_text.model.Student;

import java.util.List;

public interface IStudentService {
    void add();

    List<Student> findAll();
}
