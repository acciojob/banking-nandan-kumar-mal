package com.driver;

public class SavingsAccount extends BankAccount{


    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super(name,balance,0);
        this.maxWithdrawalLimit=maxWithdrawalLimit;
        this.rate=rate;

    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance

        double currentBalance = getBalance();
        if(amount > maxWithdrawalLimit){
            throw new Exception("Maximum Withdraw Limit Exceed");
        }
        if(currentBalance-amount<0){
            throw new Exception("Insufficient Balance");
        }else{
            setBalance(currentBalance-amount);
        }

    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        double principal=getBalance();
        double simpleInterest=(principal * years * rate)/100;
        double finalAmount = principal + simpleInterest;
        return finalAmount;

    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year

        double compoundInterest= getBalance() * (Math.pow((1+getRate()/100),years));

        return compoundInterest;
    }
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }

    public void setMaxWithdrawalLimit(double maxWithdrawalLimit) {
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

}
