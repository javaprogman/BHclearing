package net.javaprogman.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetAllFile {

    private static ArrayList<File> clearingFile = new ArrayList<>();

    public static ArrayList<File> getAllFile() throws FileNotFoundException, NullPointerException {

        File[] files = new File(".").listFiles();
        for (File file: files) {
            if (file.getName().contains("debts"))
                clearingFile.add(file);
        }

        return clearingFile;
    }
}
