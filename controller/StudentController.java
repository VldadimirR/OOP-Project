package controller;

import dto.Student;
import service.StudentService;

public class StudentController implements GeneralizedController<Student, Integer> {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student entity) {
        return studentService.createUser(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

}

