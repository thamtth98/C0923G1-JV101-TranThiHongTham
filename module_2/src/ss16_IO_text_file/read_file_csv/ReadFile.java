package ss16_IO_text_file.read_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_PATH = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\ss16_IO_text_file\\read_file_csv\\nation.csv";

    public static List<Nation> readNation() {
        List<Nation> nationList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            int id;
            String code;
            String name;
            Nation nation;
            while (((line = bufferedReader.readLine()) != null)) {
                temp = line.split(",");
                id = Integer.parseInt(temp[0]);
                code = temp[1];
                name = temp[2];
                nation = new Nation(id, code, name);
                nationList.add(nation);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Input/Output Exception!");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }  catch (IOException e) {
                    System.out.println("Input/Output Exception!");
                }
            }
        }
        return nationList;
    }

    public static void main(String[] args) {
        List<Nation> nationList = readNation();
        for (Nation nation : nationList) {
            System.out.println(nation);
        }
    }

}
