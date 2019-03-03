package net.javaprogman.readFile;

import java.io.File;

public class readAllFile {


    public File readAllFile() {
        File file = new File(getClass().getClassLoader().getResource("clearing").getFile());
        return file;
    }


}
