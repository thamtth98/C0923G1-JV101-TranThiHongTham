package ss16_IO_text_file.read_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_PATH = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\ss16_IO_text_file\\read_file_csv\\nation.csv";

    public static List<Nation> readNation() throws IOException {
        List<Nation> nationList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

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
        bufferedReader.close();
        return nationList;
    }

    public static void main(String[] args) {
        try {
            List<Nation> nationList = readNation();
            for (Nation nation : nationList) {
                System.out.println(nation);
            }
        } catch (IOException e) {
            System.out.println("FileNotFound");
        }

    }

}
