package lesson5.homework;

public class User extends NameEntity {


    public User(String name, String lastName, int age, String email, String password) {
        super(name, lastName, age, email, password, Role.USER);
    }
}
