package lesson10.homework;

import lesson10.homework.exceptions.StringFormatException;
import lesson10.homework.utils.Helper;
import lesson10.homework.utils.StringHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringHelper sh = new StringHelper();
        Helper h = new Helper();
        Scanner scanner = new Scanner(System.in);

        char [] charArray = {68, 67, 120, 78};

        try {
            sh.lineProcessing(" hhhh5", charArray);
        } catch (StringFormatException e) {
            e.printStackTrace();
        }

        h.checkPhone(scanner.nextLine());
        h.checkEmail(scanner.nextLine());
        h.checkDate(scanner.nextLine());//yyyy-mm-dd
    }
}
