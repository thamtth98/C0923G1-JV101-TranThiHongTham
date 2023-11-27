package ss16_IO_text_file.coppy_file_text;

import java.io.*;

public class CopyFileText {
    private static final String FILE_PATH_COPIED = "src/ss16_IO_text_file/coppy_file_text/iphone.csv";
    private static final String FILE_COPY = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\ss16_IO_text_file\\coppy_file_text\\iphoneCopy.csv";

    public static String readFile(String FILE_PATH) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String result = "";
        String line;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");

        } catch (IOException e) {
            System.out.println("Input/Output Exception!");

        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Input/Output Exception!");
                }
            }
        }
        return result;
    }

    public static void writeFile(String str) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(FILE_COPY);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
        } catch (IOException e) {
            System.out.println("Input/Output Exception!");
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Input/Output Exception!");
                }
            }
        }
    }

    public static void main(String[] args) {
        writeFile(readFile(FILE_PATH_COPIED));
        System.out.println("Data in file copy: \n" + readFile(FILE_COPY));
    }
}
