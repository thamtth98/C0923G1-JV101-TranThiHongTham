package ss5_getter_setter_accsess_modifier.exercise.onlyRead;

public class Student {
    private String name;
    private String classes;

    public Student(){
        this.name = "John";
        this.classes = "C02";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
