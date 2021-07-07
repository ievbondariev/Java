package lesson5.intoduction;

public class StringMethods {
    public static void main(String[] args) {
     String name = "Laletin";
     name.length(); // - показывает длину строки;
     name.toCharArray(); // - преобразовует в массив символов (чаров);
     name.trim(); // - обрезает пробелы вначале и конце строки;
     name.isEmpty(); // - проверяет не пустой ли стринг;
     name.valueOf(1); // - ? преобразует объект в строку;
     name.charAt(1); // - вернет символ из строки по номеру индекса;
     name.indexOf("e"); // - вернет индекс ячейки с этим символом;
     name.concat("add some text ot another String"); // - объединение строк;
     name.equals(name); // - сравнивает строки (а не ссылки, как в случае если просто поставить "==");
     name.equalsIgnoreCase(name); // - сравнивает строки игнорируя регистр букв (заглваные и обычные);
     name.substring(1, 3); // - обрезает от индекса до индекса (или до конца, если не указать второй индекс);
     name.toLowerCase(); // - переведет все буквы в нижний регистр;
     name.toUpperCase(); // - переведет все буквы в верхний регистр (сделает заглавными/большими);




    }
}
