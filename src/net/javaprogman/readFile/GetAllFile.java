package net.javaprogman.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

// находим в нашем каталоге все файлы содержащие в имени файла debts
public class GetAllFile {

    private static ArrayList<File> clearingFile = new ArrayList<>();

    public static ArrayList<File> getAllFile() throws  NullPointerException {

        File[] files = new File(".").listFiles();
        for (File file: files) {
            if (file.getName().contains("debts"))
                clearingFile.add(file);
        }

        return clearingFile;
    }
}
