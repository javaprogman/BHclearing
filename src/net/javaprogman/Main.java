package net.javaprogman;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.javaprogman.clients.MapClients;
import net.javaprogman.readFile.*;
import net.javaprogman.writeFile.WriteAllToFile;


public class Main {

    static Map<String, Integer> mapClientsOut = new HashMap<>();

    public static void main(String[] args) {



        try {

        MapClients.getMapClients().forEach((key, value) -> {
                System.out.println(key+ "  " + value);
        });


            ReadAllFile ral = new ReadAllFile();
            mapClientsOut = ral.ReadAllFile(MapClients.getMapClients());
            System.out.println("=================================================================================");


            mapClientsOut.forEach((key, value) -> {
                System.out.println(key+ "  " + value);
            });

            WriteAllToFile wf = new WriteAllToFile();
            wf.write(mapClientsOut);

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
