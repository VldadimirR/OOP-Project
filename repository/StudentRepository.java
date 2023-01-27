package repository;

public class StudentRepository implements UserRepository<Student, Integer> {

    private final StudentTable studentTable;

    public StudentRepository() {
        this.studentTable = new StudentTable();
    }

    @Override
    public Student save(Student entity) {
        return studentTable.save(entity);
    }

    @Override
    public Student findById(Integer id) {

        return null;
    }

    @Override
    public Student findByFio(String fio) {

        return null;
    }

    @Override
    public boolean removeByFio(String fio) {
        return studentTable.deleteByFio(fio);
    }

    @Override
    public boolean removeByGroupNumberAndAge(int groupNumber, int yearOfBirth) {
        return studentTable.deleteByFio(yearOfBirth, groupNumber);
    }

    @Override
    public Collection<Student> findAll() {
        return studentTable.getElements();
    }
}

