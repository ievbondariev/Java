package lesson10.lesson;

import lesson9.lesson.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String USER_STATUS_INFO = "User wit id = %f has status %s\n";

    public static void main(String[] args) {
        Client client1 = new Client("name", "surname");
        Client client2 = new Client("name", "surname");

        Map<Client, String>  map = new HashMap<>();

        map.put(client1, "test");
        System.out.println(map);
        System.out.println(map.get(client2));

        client1.setName("nest");
        System.out.println(map.get(client2));

        String test = "test";
        System.out.println(test.replace("t", "m"));
        System.out.println(test);

        System.out.printf(USER_STATUS_INFO, 1231.1234, "active");
        System.out.printf(USER_STATUS_INFO, 1231.5432, "active");
//
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher("2334");
//        Pattern pattern = Pattern.compile("^Start", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("Start dhfhfgh hgjgjg");
        Pattern pattern = Pattern.compile("\\d\\w\\d\\ws{3}");
        Matcher matcher = pattern.matcher("1A2bsss");

        boolean found1 = matcher.find();
//        boolean found = matcher.matches();
        System.out.println(found1);
//        System.out.println(found);

    }
}
