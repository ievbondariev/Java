package lesson8.homework.utils;

import lesson8.homework.exceptions.UserExpectedError;
import lesson8.homework.exceptions.WrongFieldException;
import lesson8.homework.exceptions.WrongSumException;

public class Helper {

    public void checkAccountLength(String account) throws WrongFieldException {
        if (account.length() != 10) {
            throw new WrongFieldException("Account length must be 10.");
        }
    }

    public void checkAmount(double amount) throws WrongSumException {
        if (amount > 1000) {
            throw new WrongSumException("Transfer limit is 1000.");
        }
    }

    public void checkAccount(String sendersAccount, String recipientsAccount) {
        if (sendersAccount.equals(recipientsAccount)) {
            throw new UserExpectedError("Sender and recipient must be different.");
        }
    }
}
