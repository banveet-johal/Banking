/**
 * Following class is responsible for
 * withdrawal, deposit, storing balance info,
 * calculate interest, monthly service fee
 */

package ca.cmpt213.asn4.bank;

public class bankaccount {
    protected double interest_rate;
    protected int service_fee;
    protected double account_balance;
    protected int withdrawal;
    protected int deposit;



    bankaccount(double account_balance, double interest_rate) throws IllegalArgumentException{

        if(interest_rate<0){
            throw new IllegalArgumentException("Interest rate invalid! Interest rate cannot be negative");
        }

        if (account_balance<0){
            throw new IllegalArgumentException("Account balance invalid! Account balance cannot be negative");
        }
        this.interest_rate = interest_rate;

        this.account_balance = account_balance;
    }

    protected void bank_withdrawal (double amount) throws IllegalArgumentException{

        if(amount>this.account_balance){
            throw new IllegalArgumentException("Your account balance is less than the withdrawal amount entered, please enter a number equal to or less than the account balance");
        }

        if(amount<=0){
            throw new IllegalArgumentException("Withdrawal amount entered is incorrect. Please make sure to enter a positive number for withdrawal");
        }

        this.account_balance = this.account_balance - amount;

        withdrawal++;
    }
    protected void bank_deposit (double amount) throws IllegalArgumentException{

        if(amount <=0){
            throw new IllegalArgumentException("Amount entered for deposit is negative, please enter a positive deposit amount");
        }

        this.account_balance = this.account_balance + amount;

        deposit++;
    }



    protected void calculate_interest (){
        double monthlyInterestRate = this.interest_rate/12;
        double monthlyInterest = this.account_balance * (monthlyInterestRate/100);
        this.account_balance = this.account_balance + monthlyInterest;
    }

    protected void service_fee (){
        this.account_balance = this.account_balance - this.service_fee;
        calculate_interest();
        service_fee=0;

        deposit=0;
        withdrawal=0;

    }
}
