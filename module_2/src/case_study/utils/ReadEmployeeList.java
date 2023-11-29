package case_study.utils;

import case_study.models.person.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadEmployeeList {
private static final String FILE_EMPLOYEE ="D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\case_study\\utils\\dataEmployee.csv";
public static List<Employee> readEmployeeList(){
    List<Employee> employees = new ArrayList<>();
    FileReader fileReader;
    BufferedReader bufferedReader = null;
    try {
        fileReader = new FileReader(FILE_EMPLOYEE);
        bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Employee employee;
        String name;
        Date dateOfBirth;
        String gender;
        Integer idNumber;
        Integer phoneNumber;
        String email;
        String idStaff;
        String level;
        String position;
        Double salary;
        while ((line = bufferedReader.readLine()) !=null){
            temp = line.split(",");
            name = temp[0];
//            dateOfBirth= temp[1];
            gender=temp[2];
            idNumber= Integer.parseInt(temp[3]);
            phoneNumber= Integer.parseInt(temp[4]);
            email=temp[5];
            idStaff=temp[6];
//            temp[7];
//            temp[8];
//            temp[9];
//            temp[10]
            employee = new Employee();
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found!!!");
    } catch (IOException e) {
        System.out.println("Input/Output exception!");
    }

    return employees;
}
}
