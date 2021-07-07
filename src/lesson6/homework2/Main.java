package lesson6.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        InitializationData initializationData = new InitializationData();
        Information information = initializationData.addInfo();

        List<Integer> namesList = new ArrayList<>();
        namesList.add(5);
        namesList.add(12);
        namesList.add(30);

        Information information1 = addMethod(namesList, information);

        System.out.println(information1.getNamesList().size());
        System.out.println(information1.getEmailSet().size());
        System.out.println(information1.getEmailNameMap().size());
    }

    private static Information addMethod(List<? extends Number> numbers, Information information) {
        List<String> namesList = information.getNamesList();
        Set<String> emailSet = information.getEmailSet();
        Map<String, String> emailNameMap = information.getEmailNameMap();

        for (Number number : numbers) {
            String nameTransform = String.valueOf(number);
            String name = nameTransform + ".name";
            String email = name + "@ukr.net";

            namesList.add(name);

            if (!emailSet.contains(email)) {
                emailSet.add(email);
            }

            if (!emailNameMap.containsKey(email)) {
                emailNameMap.put(email, name);
            }
        }
        return information;
    }
}


