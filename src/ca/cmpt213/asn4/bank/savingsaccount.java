package ca.cmpt213.asn4.bank;

public class savingsaccount extends bankaccount{

    protected boolean account_stat;

    savingsaccount(double balance,double interest){
        super(balance,interest);
        if (this.account_balance <=25){
            account_stat=false;
        }
        else {
            account_stat=true;
        }
    }

    @Override
    protected void bank_withdrawal(double money){
        if(account_stat == true){
            super.bank_withdrawal(money);
            if(this.account_balance<=25){
                account_stat=false;
            }
        }
        else {
            System.out.println("Account Inactive!!. No withdrawals allowed");
        }
    }
    @Override
    protected void bank_deposit(double money) {
        super.bank_deposit(money);
        if (this.account_balance > 25) {
            account_stat = true;
        } else if(this.account_balance<=25){
            account_stat = false;
        }
    }
    @Override
    protected void service_fee(){
        if(this.withdrawal>4){
            this.service_fee=this.withdrawal-4;
        }
        super.service_fee();
        if(this.account_balance<=25){
            this.account_stat=false;
        }
    }
}
