package case_study.utils;

import case_study.models.person.Employee;

import java.io.*;
import java.util.List;

public class WriteEmployee {
    private static final String FILE_EMPLOYEE = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\case_study\\utils\\data\\dataEmployee.csv";

    public static void writeFile(List<Employee> employees) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_EMPLOYEE);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder data = new StringBuilder();
            for (Employee employee : employees) {
                data.append(employee.getIdStaff()).append(",").append(employee.getName()).append(",")
                        .append(employee.getDateOfBirth()).append(",").append(employee.getGender()).append(",").append(employee.getIdNumber()).append(",")
                        .append(employee.getPhoneNumber()).append(",").append(employee.getEmail()).append(",").append(employee.getLevel()).append(",")
                        .append(employee.getPosition()).append(",").append(employee.getSalary()).append("\n");
            }
            bufferedWriter.write(data.toString());
        } catch (IOException e) {
            System.out.println("Input/Output exception!");
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Input/Output exception!");
                }
            }
        }
    }

    public static void deleteContain() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(FILE_EMPLOYEE));
            writer.print("");
        } catch (IOException e) {
            System.out.println("Input/Output exception!");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

    }
}
