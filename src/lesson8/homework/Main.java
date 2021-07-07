package lesson8.homework;

import lesson8.homework.entities.Client;
import lesson8.homework.exceptions.WrongFieldException;
import lesson8.homework.exceptions.WrongSumException;
import lesson8.homework.services.ServiceTransaction;
import lesson8.homework.utils.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Helper helper = new Helper();
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter senders account: ");
//        String sendersAccount = scanner.nextLine();
//        while (sendersAccount.length() != 10) {
//            try {
//                helper.checkAccountLength(sendersAccount);
//            } catch (WrongFieldException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Please enter senders account again: ");
//            sendersAccount = scanner.nextLine();
//        }

        boolean valid = true;

        do {
            System.out.println("Please enter senders account: ");
            String sendersAccount = scanner.nextLine();
            client.setAccount(sendersAccount);

            try {
                helper.checkAccountLength(sendersAccount);
                valid = true;
            } catch (WrongFieldException e) {
                e.printStackTrace();
                valid = false;
            }
        } while (!valid);
//        valid = true;


        System.out.println("Please enter recipients account: ");
        String recipientsAccount = scanner.nextLine();
        while (recipientsAccount.length() != 10) {
            try {
                helper.checkAccountLength(recipientsAccount);
            } catch (WrongFieldException e) {
                e.printStackTrace();
            }
            System.out.println("Please enter recipients account again: ");
            recipientsAccount = scanner.nextLine();
        }

        do {
            System.out.println("Please enter amount of transfer: ");
            double amount = scanner.nextDouble();
//        while (amount > 1000) {
            try {
                helper.checkAmount(amount);
                valid = true;
            } catch (WrongSumException e) {
                e.printStackTrace();
                valid = false;
            }
//            System.out.println("Please enter amount of transfer again: ");
//            amount = scanner.nextDouble();
        } while (!valid);

        ServiceTransaction serviceTransaction = new ServiceTransaction();
        serviceTransaction.sendMoney(client, recipientsAccount);
        System.out.println("Transfer is done.");
    }
}

