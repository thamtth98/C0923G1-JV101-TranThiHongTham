package ss17_binary_file.utils;

import ss17_binary_file.models.Motorbike;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadFile {
    private static String FILE_PATH = "D:\\LUA\\C0923G1-JV101\\C0923G1-JV101-TranThiHongTham\\module_2\\src\\ss17_binary_file\\common\\data.dat";

    public static List<Motorbike> readFile() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Motorbike> motorbikes = null;
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            motorbikes = (List<Motorbike>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Input/Output exception!");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    System.out.println("Input/Output exception!");
                }
            }
        }
        return motorbikes;
    }
}
