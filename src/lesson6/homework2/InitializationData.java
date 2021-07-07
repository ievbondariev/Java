package lesson6.homework2;


import java.util.*;

public class InitializationData {

    public final Information addInfo() {
        List<String> namesList = new ArrayList<>();
        Set<String> emailSet = new HashSet<>();
        Map<String, String> emailNameMap = new HashMap<>();
        Information information = new Information(namesList, emailSet, emailNameMap);

        for (int i = 0; i < 30; i++) {
            namesList.add(i + ".name");
            emailSet.add(i + ".name@ukr.net");
            emailNameMap.put(i + ".name@ukr.net", i + ".name");
        }

        for (int i = 0; i < 10; i++) {
            namesList.add("element");
            emailSet.add("element@ukr.net");
            emailNameMap.put("element@ukr.net", "element");
        }

        if (!checkInfo(information)) {
            Set<String> namesListSet = new HashSet<>(namesList);
            namesList.clear();
            namesList.addAll(namesListSet);
        }
        return information;
    }

    private boolean checkInfo(Information information) {
        return information.getNamesList().size() == information.getEmailSet().size()
                && information.getEmailSet().size() == information.getEmailNameMap().size();
    }
}



