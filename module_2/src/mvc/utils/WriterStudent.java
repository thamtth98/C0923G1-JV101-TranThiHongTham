package mvc.utils;

import mvc.models.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterStudent {
    private static final String STUDENTS_PATH = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\mvc\\data\\student.csv";

    public static void writeStudent(List<Student> studentList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(STUDENTS_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            String data= "";
            for (Student student:studentList){
                data+= student.getIdStudent() + "," + student.getName() + "," + student.getGrade() + "," + student.getPoint() + "\n";
            }
            bufferedWriter.write(data);
//            bufferedWriter.write(student.getIdStudent() + "," + student.getName() + "," + student.getGrade() + "," + student.getPoint() + "\n");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("IOException");
                }

            }
        }
    }
}
