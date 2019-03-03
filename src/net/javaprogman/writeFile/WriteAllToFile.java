package net.javaprogman.writeFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore;
import java.util.Map;

public class WriteAllToFile {


    public void write (Map<String, Integer> mapClients) throws IOException {

        File file = new File("result.data");
        if (!file.exists()) file.createNewFile();

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for (Map.Entry<String, Integer> mc : mapClients.entrySet()) {
            bw.write(mc.getKey() + " " + mc.getValue() + "\n");



        }
        bw.flush();
        bw.close();
    }
}
