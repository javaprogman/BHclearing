package net.javaprogman.clients;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapClients {

    //инициализируем базу клиентов.
    private static ArrayList<Client> listClients = new ArrayList<>();
    private static Map<String, Integer> mapClients = new HashMap<>();

    public static Map<String, Integer> getMapClients() {
        for (Client list : listClients) {
            mapClients.put(list.getName(), list.getPurse());

        }
        return mapClients;
    }

       static  {
            listClients.add(new Client("Mishel", 100));
            listClients.add(new Client("Roman", 100));
            listClients.add(new Client("Lidia", 100));
            listClients.add(new Client("Andrew", 100));

            listClients.add(new Client("MAZ", 100));
            listClients.add(new Client("BELAZ", 100));
            listClients.add(new Client("UAZ", 100));
            listClients.add(new Client("KAMAZ", 100));
            listClients.add(new Client("FERRARI", 100));

            listClients.add(new Client("Vasily", 100));
            listClients.add(new Client("Olga", 100));
            listClients.add(new Client("Masha", 100));
            listClients.add(new Client("Grigory", 100));
            listClients.add(new Client("Alena", 100));
            listClients.add(new Client("Vladimir", 100));
            listClients.add(new Client("Maxim", 100));
            listClients.add(new Client("Konstantin", 100));


        }
}
