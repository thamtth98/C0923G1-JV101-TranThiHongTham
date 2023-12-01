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
    private static final String FILE_EMPLOYEE = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\case_study\\utils\\data\\dataEmployee.csv";

    public static List<Employee> readEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_EMPLOYEE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            String idStaff;
            String name;
            String dateOfBirth;
            String gender;
            Integer idNumber;
            Integer phoneNumber;
            String email;
            String level;
            String position;
            Long salary;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                idStaff = temp[0];
                name = temp[1];
                dateOfBirth = temp[2];
                gender = temp[3];
                idNumber = Integer.parseInt(temp[4]);
                phoneNumber = Integer.parseInt(temp[5]);
                email = temp[6];
                level = temp[7];
                position = temp[8];
                salary = Long.parseLong(temp[9]);
                employee = new Employee(idStaff,name,dateOfBirth,gender,idNumber,phoneNumber,email,level,position,salary);
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        } catch (IOException e) {
            System.out.println("Input/Output exception!");
        }finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Input/Output exception!");
                }
            }
        }
        return employeeList;
    }
}
