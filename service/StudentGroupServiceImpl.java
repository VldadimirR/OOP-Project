package service;

public class StudentGroupServiceImpl implements StudentGroupService {

    @Override
    public StudentGroup getGroup() {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList);
    }

    @Override
    public StudentGroup getGroup(int number) {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList, number);
    }

    @Override
    public void removeStudent(String fio) {
        Iterator<Student> students = getStudentsFromTxt().iterator();

        while (students.hasNext()) {
            Student student = students.next();
            if (fio.equals(student.getFio()) && fio.equals(student.getFio())) {
                students.remove();
            }
        }

    }

    public void sortStudents(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

}
