package ss10_DSA.linked_link;

import ss10_DSA.array_list.MyListTest;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;
            public Student(){

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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Thắm");
        Student student2 = new Student(2,"Vi");
        Student student3 = new Student(3,"Khánh");
        Student student4 = new Student(4,"Pháp");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);

//        myLinkedList.remove(1);
//
//        for(int i = 0; i< myLinkedList.size(); i++){
//            Student student = (Student) myLinkedList.get(i);
//            System.out.println(student.getName());
//        }
//
//        MyLinkedList<Student> clone = myLinkedList.clone();
//        for(int i = 0; i< clone.size(); i++){
//            Student student = (Student) clone.get(i);
//            System.out.println(student.getName());
//        }

        System.out.println(myLinkedList.contains(student3));

    }
}
