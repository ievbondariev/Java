package lesson6.lesson.Generics;

import java.util.List;

public class Gener {
    public long getSum(List accounts) {
        long sum = 0;

        for (int i = 0, n = accounts.size(); i < n; i++) {
            Object account = accounts.get(i);
            if (account instanceof Account) {
                sum += ((Account) account).getAmount();
            }
        }

        return sum;
    }
}
