package lesson9.lesson;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("name", "Lastname");
        Client client1 = new Client("name", "Lastname");
        Class<?> classClient = client.getClass();
        System.out.println(client.getClass());

        System.out.println(client.hashCode());
        System.out.println(client1.hashCode());

        Set<Client> clients = new HashSet<>();
        clients.add(client);
        clients.add(client1);
        System.out.println(clients.toString());
    }

    public static void test(Client client) {

    }
}
