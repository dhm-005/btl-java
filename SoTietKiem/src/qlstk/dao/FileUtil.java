package qlstk.dao;

import java.io.*;
import java.util.*;

public class FileUtil {

    // Ghi list đối tượng vào file
    public static <T> void writeFile(String fileName, List<T> list) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
        } catch (IOException e) {
        }
    }

    // Đọc list đối tượng từ file
    public static <T> List<T> readFile(String fileName) {
        List<T> list = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (List<T>) ois.readObject();
        } catch (FileNotFoundException e) {
            // file chưa tồn tại -> trả về list rỗng
        } catch (IOException | ClassNotFoundException e) {
        }
        return list;
    }
}
