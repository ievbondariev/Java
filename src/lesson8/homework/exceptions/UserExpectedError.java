package lesson8.homework.exceptions;

public class UserExpectedError extends RuntimeException {
    public UserExpectedError(String message) {
        super(message);
    }
}
