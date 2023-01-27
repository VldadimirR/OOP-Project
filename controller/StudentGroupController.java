package controller;

import dto.StudentGroup;
import service.StudentGroupServiceImpl;

public class StudentGroupController implements GeneralizedController<StudentGroup, Integer> {
    private final StudentGroupServiceImpl groupServiceImpl;

    public StudentGroupController(StudentGroupServiceImpl groupServiceImpl) {
        this.groupServiceImpl = groupServiceImpl;
    }

    @Override
    public StudentGroup save(StudentGroup entity) {
        return null;
    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }
}