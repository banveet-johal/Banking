package ca.cmpt213.asn4.bank;

import junit.framework.TestCase;

public class savingsaccountTestJunit extends TestCase {

    savingsaccount test;
    
    public void test() {

        test=new savingsaccount(30,2);
        assertEquals(30.0,test.account_balance);
        assertEquals(2.0,test.interest_rate);

    }
    public void test2() {

        try{
            test=new savingsaccount(-1,0);
            fail();
            assertEquals(test.account_stat,false);
        }catch (IllegalArgumentException e){}

    }
    public void test_bank_deposit(){
        test = new savingsaccount(100,20);
        test.bank_deposit(50);
        assertEquals(test.account_balance,150.0);
        assertEquals(test.account_stat,true);
        test.bank_deposit(200);
        assertEquals(test.account_stat,true);
        assertEquals(test.deposit,2);
        try{
            test.bank_deposit(-1);
            fail();
        }catch (IllegalArgumentException e){}
        test.bank_withdrawal(14);
        test.bank_deposit(120);
    }
    public void test_bank_withdrawal() {
        test = new savingsaccount(2000,6);
        test.bank_withdrawal(10);
        assertEquals(test.account_balance,1990.0);
        try{
            test.bank_withdrawal(-100);
        }catch (IllegalArgumentException e){}
        assertEquals(test.withdrawal,1);

    }
    public void test_calculate_interest(){
        test=new savingsaccount(50,12);
        test.calculate_interest();
        assertEquals(test.account_balance,50.5);
    }


    public void test_service_fee() {
        test=new savingsaccount(120,28);
        test.bank_withdrawal(8);
        test.bank_withdrawal(10);
        test.bank_withdrawal(16);
        test.service_fee();
        assertEquals(test.account_balance,88.00666666666666);
        assertEquals(test.service_fee,0);
        assertEquals(test.deposit,0);
        assertEquals(test.withdrawal,0);

    }



}