package mvc.utils;

import mvc.models.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderStudent {
    private static final String STUDENTS_PATH = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\mvc\\data\\student.csv";

    public static List<Student>  readFile() {
        FileReader readerStudent = null;
        BufferedReader bufferedReader = null;
        String line;
        String[] temp;
        Student student = null;
        List<Student> studentList = new ArrayList<>();
        try {
            readerStudent = new FileReader(STUDENTS_PATH);
            bufferedReader = new BufferedReader(readerStudent);
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String idStudent = temp[0];
                String name = temp[1];
                String grade = temp[2];
                Double point = Double.parseDouble(temp[3]);
                studentList.add(new Student(idStudent, name, grade, point)) ;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("IOException");
                }
            }

        }
        return studentList;
    }
}
