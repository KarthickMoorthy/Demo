package com.bank;

public class Main {

    public static void main(String[] args) {
        final BankAccount account = new BankAccount("12345-678", 1000.00);



        // Create and start the threads here...
//        Thread trThread1 = new Thread() {
//            public void run() {
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            }
//        };
//
//        Thread trThread2 = new Thread() {
//            public void run() {
//                account.deposit(203.75);
//                account.withdraw(100.00);
//            }
//        };

        Thread trThread1 = new Thread(() -> {
            account.deposit(300.00);
            account.withdraw(50.00);
            System.out.println("The balance on the account -:"+ account.getBalance());
        });

        Thread trThread2 = new Thread(() -> {
            account.deposit(203.75);
            account.withdraw(100.00);
            System.out.println("The balance on the account -:"+ account.getBalance());
        });

        trThread1.setName("Thread1");
        trThread2.setName("Thread2");
        trThread1.start();
        trThread2.start();

        System.out.println("The balance on the account  :"+ account.getBalance());
    }
}
