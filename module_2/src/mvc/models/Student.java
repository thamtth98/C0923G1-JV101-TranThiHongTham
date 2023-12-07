package mvc.models;

public class Student {
    private String idStudent;
    private String name;
    private String grade;
    private Double point;

    public Student(String idStudent, String name, String grade, Double point) {
        this.idStudent = idStudent;
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public Student() {
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", point=" + point +
                '}';
    }
}
