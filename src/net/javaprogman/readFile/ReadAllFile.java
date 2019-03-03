package net.javaprogman.readFile;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadAllFile {

    private String line;
    private String[] lines;
    private Map<String, Map<String, Integer>> transactions = new TreeMap<>();
    Map<String, Integer> recipient = new HashMap<>();

    public ReadAllFile(){}

    public Map<String, Integer> ReadAllFile(Map<String, Integer> mapClients) throws FileNotFoundException, NullPointerException {
        try {
            for (File file : GetAllFile.getAllFile()) {

                BufferedReader buffr = new BufferedReader(new FileReader(file));

                while ((line = buffr.readLine()) != null) {
                    lines = line.split(" ");
                    if (mapClients.get(lines[0]) >= Integer.parseInt(lines[2])) {
                        mapClients.put(lines[0], mapClients.get(lines[0]) - Integer.parseInt(lines[2]));
                        mapClients.put(lines[1], mapClients.get(lines[1]) + Integer.parseInt(lines[2]));
                    } else {
                        System.out.println(lines[0] + " can not transfer money to " + lines[1]);
                        continue;
                    }


                }


            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return  mapClients;
    }
}
