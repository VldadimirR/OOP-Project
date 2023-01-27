package repository;

import java.util.Collection;

import dto.Teacher;

public class TeacherRepository implements UserRepository<Teacher, Integer> {
    @Override
    public Teacher save(Teacher entity) {
        return null;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher findByFio(String LastName) {
        return null;
    }

    @Override
    public boolean removeByFio(String lastName) {
        return false;
    }

    @Override
    public boolean removeByGroupNumberAndAge(int age, int groupNumber) {
        return false;
    }

    @Override
    public Collection<Teacher> findAll() {
        return null;
    }
}

