package ss16_IO_text_file.coppy_file_text;

import java.io.*;

public class CopyFileText {
    private static final String FILE_PATH_COPIED = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\ss16_IO_text_file\\coppy_file_text\\iphone.csv";
    private static final String FILE_COPY = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\ss16_IO_text_file\\coppy_file_text\\iphoneCopy.csv";

    public static String readFile(String FILE_PATH) throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH_COPIED);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String result = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            result += line + "\n";
        }
        bufferedReader.close();
        return result;
    }

    public static void writeFile(String str) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_COPY);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(str);
        bufferedWriter.close();
    }

    public static void main(String[] args) {
        try {
            writeFile(readFile(FILE_PATH_COPIED));
            System.out.println("Data in file copy: \n"+readFile(FILE_COPY));
        } catch (IOException e) {
            System.out.println("File not found!");;
        }

    }
}
