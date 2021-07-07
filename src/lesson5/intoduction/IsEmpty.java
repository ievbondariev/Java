package lesson5.intoduction;

public class IsEmpty {
    public static void main(String[] args) {
        String nullString = null; // - null - написали для того, чтобы зарезервировать не только имя(nullString) но и память под него
        String noCharsValueString = " ";

        boolean isEmptyNullString = nullString == null;
        boolean isEmptyCharsValueString = nullString == null;

//        boolean isEmptyMethodNullString = nullString.isEmpty(); // - нельзя выполнять со строкой в которой null;
        boolean isEmptyMethodCharsValueString = noCharsValueString.isEmpty();

        System.out.println(noCharsValueString.isEmpty());

    }
}
