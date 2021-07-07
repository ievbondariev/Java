package lesson5.homework;

public class Admin extends NameEntity {


    public Admin(String name, String lastName, int age, String email, String password) {
        super(name, lastName, age, email, password, Role.ADMIN);
    }
}
