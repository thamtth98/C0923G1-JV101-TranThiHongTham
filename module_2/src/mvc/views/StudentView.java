package mvc.views;

import mvc.controllers.StudentController;
import mvc.models.Student;
import mvc.utils.ExceptionInteger;
import mvc.utils.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    private StudentController studentController = new StudentController();

    public void menu() {
        do {
            System.out.println("1.Hiển thị danh sách \n" +
                    "2.Thêm \n" +
                    "3.Xóa \n" +
                    "4.Thoát ");
            System.out.print("Chọn: ");
            int number = ExceptionInteger.exceptionInt();
            switch (number) {
                case 1:
                    List<Student> studentList = studentController.showList();
                    for (Student student: studentList){
                        System.out.println(student);
                    }
                    break;
                case 2:
                    Student student = infoStudent();
                    studentController.addStudent(student);
                    System.out.println("Thêm thành công!");
                    break;
                case 3:
                    System.out.print("Nhập id học sinh cần xóa: ");
                    String idStudent = scanner.nextLine();
                    student = studentController.findIdStudent(idStudent);
                    if(student != null){
                        System.out.println("Tìm thấy: "+ student);
                        System.out.print("Nhấn y để xóa: ");
                        String choice = scanner.nextLine();
                        if(choice.equalsIgnoreCase("y")){
                            studentController.remove(student);
                        }else {
                            System.out.println("Không xóa");
                        }
                    }else {
                        System.out.println("Không tìm thấy!");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.print("Vui lòng chọn lại cho đúng: ");
            }
        } while (true);

    }



    private Student infoStudent() {
        System.out.print("Nhập mã học sinh: ");
        String idStudent = scanner.nextLine();
        while (!Regex.checkID(idStudent) ){
            System.out.println("Nhập sai dạng, nhập lại: ");
            idStudent = scanner.nextLine();
        }
        while (studentController.findIdStudent(idStudent) != null){
            System.out.println("Không được trùng mã: ");
            idStudent = scanner.nextLine();
        }
        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        while (!Regex.checkName(name)){
            System.out.print("Tên phải viết hoa trước mỗi chữ cái, nhập lại: ");
            name = scanner.nextLine();
        }

        System.out.print("Nhập lớp học sinh: ");
        String grade = scanner.nextLine();

        System.out.print("Nhập điểm học sinh: ");

        Double point = Double.parseDouble(scanner.nextLine());
        while (point < 0){
            System.out.println("Điểm không âm");
            point = Double.parseDouble(scanner.nextLine());
        }
        return new Student(idStudent, name, grade, point);
    }
}
