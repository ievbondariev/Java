package lesson8.homework.services;

import lesson8.homework.entities.Client;
import lesson8.homework.utils.Helper;

public class ServiceTransaction {

    public void sendMoney (Client client, String account) {
        Helper helper = new Helper();
        helper.checkAccount(client.getAccount(), account);
    }
}
