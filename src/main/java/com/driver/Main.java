package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount("JccAio", 10000.0, 1000.0);
//
//        System.out.println(bankAccount.getName());
//
//        System.out.println(bankAccount.getBalance());
//
//        System.out.println(bankAccount.getMinBalance());

//        BankAccount bankAccount = new BankAccount("JccAio", 10000.0, 1000.0);
//        bankAccount.deposit(500.0);
//
//        System.out.println(bankAccount.getName());
//
//        System.out.println(bankAccount.getBalance());
//
//        System.out.println(bankAccount.getMinBalance());
//
//        bankAccount.deposit(1500.0);
//
//        System.out.println(bankAccount.getName());
//
//        System.out.println(bankAccount.getBalance());
//
//        System.out.println(bankAccount.getMinBalance());
//
//        bankAccount.deposit(373.0);
//
//        System.out.println(bankAccount.getName());
//
//        System.out.println(bankAccount.getBalance());
//
//        System.out.println(bankAccount.getMinBalance());

//        BankAccount bankAccount = new BankAccount("JccAio", 10000.0, 1000.0);
//
//        try {
//            bankAccount.withdraw(500.0);
//        } catch (Exception var5) {
//            System.out.println(var5.getMessage().equals("Insufficient Balan")) ;
//        }
//
//        System.out.println(bankAccount.getName());
//
//        System.out.println(bankAccount.getBalance());
//
//        System.out.println(bankAccount.getMinBalance());
//
//        try {
//            bankAccount.withdraw(1500.0);
//        } catch (Exception var4) {
//            System.out.println(var4.getMessage().equals("Insufficient Balan"));
//        }
//
//        System.out.println(bankAccount.getName());
//        System.out.println(bankAccount.getBalance());
//
//        System.out.println(bankAccount.getMinBalance());
//
//        try {
//            bankAccount.withdraw(7500.0);
//        } catch (Exception var3) {
//            System.out.println(var3.getMessage().equals("Insufficient Balance"));
//        }
//
//        System.out.println(bankAccount.getName());
//
//        System.out.println(bankAccount.getBalance());
//
//        System.out.println(bankAccount.getMinBalance());

//        CurrentAccount currentAccount;
//        try {
//            currentAccount = new CurrentAccount("curr", 5000.0, "ABCDE");
//
//            System.out.println(currentAccount.getName().equals("curr"));
//
//            System.out.println(currentAccount.getBalance());
//
//            System.out.println(currentAccount.getMinBalance());
//
//            System.out.println(currentAccount.getTradeLicenseId().equals("ABCDE"));
//        } catch (Exception var5) {
//            System.out.println(var5.getMessage().equals("Insufficient Balan"));
//        }
//
//        try {
//            currentAccount = new CurrentAccount("curr", 7000.0, "ABCDE");
//
//            System.out.println(currentAccount.getName().equals("curr"));
//
//            System.out.println(currentAccount.getBalance());
//
//            System.out.println(currentAccount.getMinBalance());
//
//            System.out.println(currentAccount.getTradeLicenseId().equals("ABCDE"));
//        } catch (Exception var4) {
//            System.out.println(var4.getMessage().equals("Insufficient Balan"));
//        }

//        try {
//            currentAccount = new CurrentAccount("curr", 0.0, "ABCDE");
//
//            System.out.println(currentAccount.getName().equals("curr"));
//
//            System.out.println(currentAccount.getBalance());
//
//            System.out.println(currentAccount.getMinBalance());
//
//            System.out.println(currentAccount.getTradeLicenseId().equals("ABCDE"));
//        } catch (Exception var3) {
//            System.out.println(var3.getMessage().equals("Insufficient Balance"));
//        }
//
//        try {
//            currentAccount = new CurrentAccount("curr", 4999.0, "ABCDE");
//
//            System.out.println(currentAccount.getName().equals("curr"));
//
//            System.out.println(currentAccount.getBalance());
//
//            System.out.println(currentAccount.getMinBalance());
//
//            System.out.println(currentAccount.getTradeLicenseId().equals("ABCDE"));
//        } catch (Exception var2) {
//            System.out.println(var2.getMessage().equals("Insufficient Balance"));
//        }

//        SavingsAccount savingsAccount = new SavingsAccount("save", 0.0, 5.0, 50.0);

//        System.out.println(savingsAccount.getName().equals("save"));
//
//        System.out.println(savingsAccount.getBalance());
//
//        System.out.println(savingsAccount.getMinBalance());
//
//        System.out.println(savingsAccount.getMaxWithdrawalLimit());
//
//        System.out.println(savingsAccount.getRate());
//
//        try {
//            savingsAccount.withdraw(1.0);
//        } catch (Exception var6) {
//            System.out.println(var6.getMessage().equals("Insufficient Balance"));
//        }
//
//        try {
//            savingsAccount.deposit(500.0);
//
//            System.out.println(savingsAccount.getName().equals("save"));
//
//            System.out.println(savingsAccount.getBalance());
//
//            System.out.println(savingsAccount.getMinBalance());
//
//            System.out.println(savingsAccount.getMaxWithdrawalLimit());
//
//            System.out.println(savingsAccount.getRate());
//
//            savingsAccount.withdraw(1.0);
//
//            System.out.println(savingsAccount.getName().equals("save"));
//
//            System.out.println(savingsAccount.getBalance());
//
//            System.out.println(savingsAccount.getMinBalance());
//
//            System.out.println(savingsAccount.getMaxWithdrawalLimit());
//
//            System.out.println(savingsAccount.getRate());
//
//            savingsAccount.withdraw(5.0);
//
//            System.out.println(savingsAccount.getName().equals("save"));
//
//            System.out.println(savingsAccount.getBalance());
//
//            System.out.println(savingsAccount.getMinBalance());
//
//            System.out.println(savingsAccount.getMaxWithdrawalLimit());
//
//            System.out.println(savingsAccount.getRate());
//        } catch (Exception var5) {
//            System.out.println(var5.getMessage().equals("Insufficient Balan"));
//        }
//
//        try {
//            savingsAccount.withdraw(6.0);
//
//            System.out.println(savingsAccount.getName().equals("save"));
//
//            System.out.println(savingsAccount.getBalance());
//
//            System.out.println(savingsAccount.getMinBalance());
//
//            System.out.println(savingsAccount.getMaxWithdrawalLimit());
//
//            System.out.println(savingsAccount.getRate());
//        } catch (Exception var4) {
//            System.out.println(var4.getMessage().equals("Maximum Withdraw Limit Exceeded"));
//        }
//
//        try {
//            savingsAccount.withdraw(1000.0);
//
//            System.out.println(savingsAccount.getName().equals("save"));
//
//            System.out.println(savingsAccount.getBalance());
//
//            System.out.println(savingsAccount.getMinBalance());
//
//            System.out.println(savingsAccount.getMaxWithdrawalLimit());
//
//            System.out.println(savingsAccount.getRate());
//        } catch (Exception var3) {
//            System.out.println(var3.getMessage().equals("Maximum Withdraw Limit Exceeded"));
//        }
//
//        SavingsAccount savingsAccount = new SavingsAccount("acc1", 1000.0, 1.0, 10.0);
//        System.out.println(savingsAccount.getSimpleInterest(5));
//        Double diff = savingsAccount.getSimpleInterest(5) - 1500.0;
//        System.out.println(diff);
//
//        System.out.println(Math.abs(diff) <= 1.0);
//
//        savingsAccount = new SavingsAccount("acc1", 1000.0, 1.0, 5.0);
//        System.out.println(savingsAccount.getCompoundInterest(2, 10));
//        Double diff2 = savingsAccount.getCompoundInterest(2, 10) - 1638.52;
//        System.out.println(diff2);
//        System.out.println(Math.abs(diff2) <= 100.0);

//        SavingsAccount savingsAccount = new SavingsAccount("acc1", 5500.0, 1.0, 20.0);
//        System.out.println(savingsAccount.getCompoundInterest(12, 2));
//        Double diff = savingsAccount.getCompoundInterest(12, 2) - 8178.033;
//        System.out.println(diff);
//        System.out.println(Math.abs(diff) <= 100.0);
    }


}