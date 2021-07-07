package lesson10.homework.utils;


import lesson10.homework.exceptions.StringFormatException;

public class StringHelper {

    public void lineProcessing(String line1, char[] charArray) throws StringFormatException {

        if (charArray == null) {
            throw new NullPointerException("Array is null");
        }
        String line = String.valueOf(charArray);

        if (line1.isBlank() || line.isBlank()) {
            throw new StringFormatException("Line is blanc");
        }
        line = line1.strip().toUpperCase() + " " + line.strip().toLowerCase();

        System.out.println(line);

        if (line.length() % 2 == 0) {
            line = line.substring(0, line.length() / 2 - 1) + line.substring(line.length() / 2 + 1);

        } else {
            line = line.substring(0, line.length() / 2) + line.substring(line.length() / 2 + 1);
        }

        System.out.println(line);
    }
}
