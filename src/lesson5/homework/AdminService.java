package lesson5.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdminService extends AbstractService implements Service {

    public void signUser(NameEntity nameEntity) throws IOException {
        File file = new File(getFilePath());
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            fileWriter.write(nameEntity.getName() + '\n');
            fileWriter.write(nameEntity.getLastName() + '\n');
            fileWriter.write(nameEntity.getAge() + "\n");
            fileWriter.write(nameEntity.getEmail() + '\n');
            fileWriter.write(nameEntity.getPassword() + '\n');
            fileWriter.write(nameEntity.getRole().toString() + '\n');
            fileWriter.close();

        }
    }


