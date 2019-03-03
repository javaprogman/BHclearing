package net.javaprogman;

import net.javaprogman.clients.Client;

import java.io.File;
import java.util.ArrayList;

import net.javaprogman.readFile.*;


public class Main {

    public static void main(String[] args) {

        //инициализируем базу клиентов.
        ArrayList<Client> listClients = new ArrayList<>();

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
