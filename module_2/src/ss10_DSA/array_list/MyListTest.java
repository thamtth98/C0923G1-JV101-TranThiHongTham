package ss10_DSA.array_list;

import java.util.Arrays;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student(1,"Thắm");
        Student student2 = new Student(2,"Vi");
        Student student3 = new Student(3,"Khánh");
        Student student4 = new Student(4,"Pháp");

        MyList<Student> studentMyList = new MyList<>();

        studentMyList.add(student1,0);
        studentMyList.add(student2,1);
        studentMyList.add(student3,2);
        studentMyList.add(student4);
//        studentMyList.clear();

        for (int i = 0; i < studentMyList.size();i++){
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.id);
            System.out.println(student.name);
        }
        System.out.println(studentMyList.get(3).getName());
        System.out.println(studentMyList.indexOf(student1));
        System.out.println(studentMyList.contains(student3));

        MyList<Student> studentNewList = new MyList<>();
        studentNewList = studentMyList.clone();
        for (int i = 0; i < studentMyList.size(); i++){
            System.out.println(studentNewList.get(i).getName());
        }
    }
}
