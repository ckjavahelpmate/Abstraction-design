package Abstraction;

abstract class Bank {
public abstract void createAccount(int acno, String pwd, double bal, User u);
public abstract void deposite(double amt);
public abstract void withdraw(double amt);
public abstract double balanceEnquiery();
public abstract void changePwd(String pwd);
}
