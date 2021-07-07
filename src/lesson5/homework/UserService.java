package lesson5.homework;


public class UserService extends AbstractService implements  Service {
    private static final String FORM = "Access denied for User";

    @Override
    public void signUser(NameEntity nameEntity) {
        System.out.println(FORM);
    }
}
