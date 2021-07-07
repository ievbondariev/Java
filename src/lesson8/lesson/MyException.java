package lesson8.lesson;


public class MyException extends Exception{
    public MyException(Throwable e) {
        initCause(e);
    }
}

