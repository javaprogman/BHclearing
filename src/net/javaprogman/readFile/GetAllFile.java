package net.javaprogman.readFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readFile {

    private ArrayList<File> goodFile;

    public ArrayList<File> readFile() throws IOException {

        File[] files = new File(".").listFiles();
        for (File file: files) {
            if (file.getName().contains("debts")
            goodFile =
        }
    }
}
