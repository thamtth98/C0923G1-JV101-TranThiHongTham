package case_study.utils.FileCustomer;

import case_study.models.person.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteCustomerList {
    private static final String CUSTOMER_PATH = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\case_study\\utils\\data\\dataCustomer.csv";

    public static void writeCustomerFile(List<Customer> customerList) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(CUSTOMER_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder data = new StringBuilder();
            for (Customer customer:customerList){
                data.append(customer.getIdCustomer()).append(",").append(customer.getName()).append(",").append(customer.getDateOfBirth())
                        .append(",").append(customer.getGender()).append(",").append(customer.getIdNumber()).append(",").append(customer.getPhoneNumber()).append(",")
                        .append(customer.getEmail()).append(",").append(customer.getTypeCustomer()).append(",").append(customer.getAddress()).append("\n");
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


}
