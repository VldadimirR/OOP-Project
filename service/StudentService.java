package service;

import java.util.Collections;
import java.util.List;

import dto.Student;
import dto.comparators.UserComparator;
import repository.StudentRepository;

public class StudentService implements UserService<Student> {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createUser(Student user) {
        return studentRepository.save(user);
    }

    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    public Student findByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    public boolean removeByFio(String fio) {
        return studentRepository.removeByFio(fio);
    }

    public boolean removeByGroupNumberAndAge(int groupNumber, int yearOfBirth) {
        return studentRepository.removeByGroupNumberAndAge(groupNumber, yearOfBirth);
    }

    @Override
    public void sortUsersByName(List<Student> users) {
        Collections.sort(users, new UserComparator());
    }

}