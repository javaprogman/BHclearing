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

        // обработка ошибок в методе мэйн плохая идея?
        try {

            // заполняем мапу клиентами для работы с транзакциями.
        MapClients.getMapClients().forEach((key, value) -> {
                System.out.println(key+ "  " + value);
        });

              // читаем все за раз, вдруг в следующий раз файлов будет намного больше?
            // при чтении траназкций сразу их и обрабатываем.
            ReadAllFile ral = new ReadAllFile();
            mapClientsOut = ral.ReadAllFile(MapClients.getMapClients());
            System.out.println("=================================================================================");

             // Проверяем, что у нас получилось
            mapClientsOut.forEach((key, value) -> {
                System.out.println(key+ "  " + value);
            });
                // пишем все в один файл, как напиано в е-майл,лень в отдельные файлы переделывать...
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
