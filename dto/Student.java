package dto;

public class Student extends User implements Comparable<Student> {
    private String department;
    private int course;
    private int yearOfBirth;
    private int groupNumber;

    public Student(String fio) {
        super(fio);
    }

    public Student(String department, int course, int yearOfBirth, String fio, int groupNumber) {
        super(fio);
        this.course = course;
        this.department = department;
        this.yearOfBirth = yearOfBirth;
        this.groupNumber = groupNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.yearOfBirth, o.yearOfBirth);
    }

    @Override
    public String toString() {
        return "Student{ " +
                (getFio() != null ? "firstName=" + getFio() + " " : "") +
                (department != null ? "department=" + department + " " : "") +
                (course != 0 ? "course=" + course + " " : "") +
                (yearOfBirth != 0 ? "yearOfBirth=" + yearOfBirth + " " : "") +
                (groupNumber != 0 ? "groupNumber=" + groupNumber + " " : "") +
                '}';
    }

}