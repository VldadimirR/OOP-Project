package controller;

import dto.Teacher;
import service.TeacherService;

public class TeacherController implements GeneralizedController<Teacher, Integer> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher save(Teacher entity) {
        return null;
    }


    @Override
    public Teacher findById(Integer id) {
        return null;
    }

}

