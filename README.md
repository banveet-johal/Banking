# A first-level heading


#Overview :
 
A local startup bank has commissioned to create part of their online banking
software. The bank currently only contains savings accounts but has plans to add other types of
accounts. 

Description:

Designed an abstract class named BankAccount to hold the following data for a bank account:

--The Balance

--Number of deposits this month

--Number of withdrawals

--Annual interest rate

--Monthly service charges

The Class has the following methods :

Constructor: The constructor accepts arguments for the balance and
annual interest rate; both arguments must be non-negative
deposit

deposit: A method that accepts an (positive) argument for the amount of
the deposit. The method adds the argument to the
account balance. It also increments the variable holding
the number of deposits.

withdraw: A method that accepts an (positive) argument for the amount of
the withdrawal. The method subtracts the argument from
the balance. It also increments the variable holding the
number of withdrawals.

calcInterest: A method that updates the balance by calculating the monthly
interest earned by the account, and adding this interest to the
balance. 

This is performed by the following formulas:
Monthly Interest Rate = [Annual Interest Rate / 12)
Monthly Interest = Balance * Monthly Interest Rate
Balance = Balance + Monthly Interest

monthlyProcess: A method that subtracts the monthly service charges from the
balance, calls the calcInterest method, and then sets the
variables that hold the number of withdrawals, number of
deposits, and monthly service charges to zero.

Design a SavingsAccount class that extends the BankAccount class. 

The SavinqsAccount class has a status field to represent an active or inactive account. If the balance of a savings
account falls below $25, it becomes inactive.No more withdrawals may be made until the balance is raised above $25, at which time the account becomes
active again. 

The savings account class should has the following methods:

withdraw: A method that determines whether the account is inactive
before a withdrawal is made. (No withdrawal will be allowed if
the account is not active.) A withdrawal is then made by
calling the superclass version of the method.

deposit: A method that determines whether the account is inactive
before a deposit is made. If the account is inactive and the
deposit brings the balance above $25, the account becomes
active again. A deposit is then made by calling the superclass
version of the method.

monthlyProcess: Before the superclass method is called, this method checks
the number of withdrawals. If the number of withdrawals for
the month is more than 4, a service charge of $1 for each
withdrawal above 4 is added to the superclass field that holds
the monthly service charges. 

Finally, a series of tests are performed using the Junit3 framework. The tests successfully test for all
requirements mentioned above. 

The tests also include error cases (For example,
passing in a negative number into the deposit() method).
