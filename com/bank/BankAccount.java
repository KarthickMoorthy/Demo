package com.bank;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Karthick on 1/3/2021
 */
public class BankAccount {

    private double balance;
    final private String accountNumber;
    final private ReentrantLock lock ;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock(true);
    }

    public void deposit(double amount) {
        boolean status = false;
        try{
            if(lock.tryLock(1000, TimeUnit.MICROSECONDS)){
                try{
                    balance += amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            } else{
                System.out.println("Did not acquire the lock");
            }

        }catch (InterruptedException e){
            //Do Something here
        }
        System.out.println("the transaction status  "+ status + "On the Thread " + Thread.currentThread());
    }

    public void withdraw(double amount) {
        boolean status = false;
        try{
            if(lock.tryLock(1000, TimeUnit.MICROSECONDS)){
                try{
                    balance -= amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            } else{
                System.out.println("Did not acquire the lock");
            }

        }catch (InterruptedException e){
            //Do Something here
        }
        System.out.println("the transaction status  "+ status);
    }

/*    public void deposit(double amount) {
        synchronized (this) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        synchronized (this) {
            balance -= amount;
        }
    }*/

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}