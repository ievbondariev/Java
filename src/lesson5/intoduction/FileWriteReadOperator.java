package lesson5.intoduction;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileWriteReadOperator {

    static String pathToFile = "/Users/ievhenbondarew/Desktop/Java/MyTextFile.txt";


    public static void main(String[] args) throws IOException {
        writeToFile(pathToFile);
//        readFromFile(pathToFile); // - просто закоментировали чтобы запустить метод чтение при помощи сканера;
        readFromFileByScanner(pathToFile);
    }


    private static void writeToFile(String pathToFile) throws IOException {
        FileWriter fileWriter = new FileWriter(pathToFile, true); // - булевое значение true вписали для того, чтобы строка добавлялась в существующий файл, иначе он каждый раз будет удаляться и создавться новый со всеми строками;
//        FileWriter fileWriter = new FileWriter(pathToFile);
        fileWriter.write("Concat data to file\n");
        fileWriter.write("Test\n");
        fileWriter.write("My first file writer data saved to file\n");
        fileWriter.write("My second string file writer data saved to file");

        fileWriter.close();
    }

    private static void readFromFile(String pathToFile) throws IOException {
        char[] myCharArray = new char[1000];

        FileReader fileReader = new FileReader(pathToFile);
        fileReader.read(myCharArray);

        System.out.println("file have been read");
        System.out.println(Arrays.toString(myCharArray));

        fileReader.close();
    }

    private static void readFromFileByScanner(String pathToFile) throws IOException{
        FileReader fileReader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            String fileString = scanner.nextLine();
            System.out.println("Read one string from file: ");
            System.out.println(fileString);
        }

        scanner.close();
        fileReader.close();

    }

}
