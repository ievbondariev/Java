package lesson5.intoduction;

public class CharAt {
    public static void main(String[] args) {

//      name.charAt(1); // - вернет символ из строки по номеру индекса;

        String mySimpleString = new String ("Test");
        System.out.println("String value: "+ mySimpleString);

        char mySimpleStringCharValue = mySimpleString.charAt(2);
        System.out.println("Char at 2: " + mySimpleStringCharValue);

    }
}
