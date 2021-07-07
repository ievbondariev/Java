package lesson5.homework;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class AbstractService implements Service {

    private String filePath;

    @Override
    public boolean checkUser(NameEntity nameEntity) throws IOException {

        File file = new File(getFilePath());
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String emailLine = nameEntity.getEmail();
            if (line.equals(emailLine)) {
                return true;
            }
        }
        scanner.close();
        fileReader.close();
        return false;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

