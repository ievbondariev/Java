package lesson5.homework;

import java.io.FileReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        FileReader file = new FileReader("file1.txt");
        Scanner scan = new Scanner(file);

        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        scan.close();
        file.close();
    }
}

