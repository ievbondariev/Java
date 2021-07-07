package lesson5.homework;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/ievhenbondarew/Desktop/Java/file1.txt";

        Admin admin = new Admin("Petr", "Petrov", 30, "22@mail.ru", "54321");
        User user = new User("Ivan", "Ivanov", 20, "11@ukr.net", "12345");
        User user1 = new User("Ali", "Baba", 21, "101@mail.ru", "11111");

        UserService userService = new UserService();
        userService.setFilePath(filePath);

        AdminService adminService = new AdminService();
        adminService.setFilePath(filePath);

        userService.signUser(user);
        userService.signUser(admin);
        userService.signUser(user1);

        adminService.signUser(admin);
        adminService.signUser(user);
        adminService.signUser(user1);

        System.out.println(userService.checkUser(admin));
        System.out.println(adminService.checkUser(user));
        System.out.println(adminService.checkUser(user1));
        System.out.println(userService.checkUser(user1));
    }
}