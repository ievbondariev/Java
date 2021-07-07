package lesson5.homework;

import java.io.IOException;

public interface Service {
    void signUser(NameEntity nameEntity) throws IOException;

    boolean checkUser(NameEntity nameEntity) throws IOException;
}
