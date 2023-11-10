package ss5_getter_setter_accsess_modifier.exercise.only_read;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Tui");
        student.setClasses("C09");
        System.out.println(student);
    }

}
