package case_study.utils.FileCustomer;

import case_study.models.person.Customer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomerList {
    private static final String CUSTOMER_PATH = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\case_study\\utils\\data\\dataCustomer.csv";

    public static List<Customer> readCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(CUSTOMER_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            String idCustomer;
            String name;
            String gender;
            String idNumber;
            String phoneNumber;
            LocalDate dateOfBirth;
            String email;
            String typeCustomer;
            String address;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                idCustomer = temp[0];
                name = temp[1];
                dateOfBirth = LocalDate.parse(temp[2]);
                gender = temp[3];
                idNumber = temp[4];
                phoneNumber = temp[5];
                email = temp[6];
                typeCustomer = temp[7];
                address = temp[8];
                customerList.add(new Customer(idCustomer, name, dateOfBirth, gender, idNumber, phoneNumber, email, typeCustomer, address));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception!");
        } catch (IOException e) {
            System.out.println("Input/Output exception!");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Input/Output exception!!");
                }
            }
        }
        return customerList;
    }
}
