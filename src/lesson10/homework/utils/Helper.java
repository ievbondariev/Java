package lesson10.homework.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public void checkPhone(String line) {
        Pattern pattern = Pattern.compile("^(\\+380)[0-9]{9}$");
        Matcher matcher = pattern.matcher(line);

        System.out.println("Valid phone UA-format: " + matcher.matches());
    }

    public void checkEmail(String line1) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]" +
                "+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(line1);

        System.out.println("Valid email: " + matcher.matches());
    }

    public void checkDate(String line2) {
        Pattern pattern = Pattern.compile("^((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$");
        Matcher matcher = pattern.matcher(line2);

        System.out.println("Valid date: " + matcher.matches());
    }
}
