package lesson5.intoduction;

public class Trim {
    public static void main(String[] args) {

//      name.trim(); // - обрезает пробелы вначале и конце строки;

        String myTestStringToTrim = "   My test trim string ";

        System.out.println("trimmed without new String object\n");
        System.out.println(myTestStringToTrim.trim());
        System.out.println("trimmed without new String object length: " + myTestStringToTrim.trim().length());

        String myTestStringTrimmed = myTestStringToTrim.trim();
        System.out.println("trimmed with new String object\n");
        System.out.println(myTestStringTrimmed);
        System.out.println("trimmed without new String object length: " + myTestStringToTrim.trim().length());
    }
}
