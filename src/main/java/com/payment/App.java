package com.payment;

import com.payment.model.Account;
import com.payment.model.User;

public class App {
    public static void main(String args[]) {

        User user = new User("Vaishnavi", "vaishnavimore23@outlook.com");
        System.out.println(user);

        // create account for user
        Account account = new Account(user.getUserID(), 1000.00);
        System.out.println(account);

        // test deposit and withdraw

        account.deposit(500.00);
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(100);
        System.out.println("After withdraw: " + account.getBalance());

    }
}
