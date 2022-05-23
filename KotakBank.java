package Abstraction;

public class KotakBank extends Bank{
String bname;
String branch;
Account a;
	@Override
	public void createAccount(int acno, String pwd, double bal, User u) {
		if(a==null) {
			a=new Account(acno,pwd,bal,u);
			System.out.println("Account created successfully");
		}
		else
			System.out.println("Sorry no accounts are availables");
	}

	@Override
	public void deposite(double amt) {
		a.bal+=amt;
		System.out.println(amt+" is credited to your account.\nBalace: "+a.bal);
	}

	@Override
	public void withdraw(double amt) {
		a.bal-=amt;
		System.out.println(amt+" is debited from your account.\nBalace: "+a.bal);
	}

	@Override
	public double balanceEnquiery() {
		System.out.println("Account balace: "+a.bal);
		return 0;
	}

	@Override
	public void changePwd(String pwd) {
		a.pwd=pwd;
		System.out.println("password successfully changed");
		
	}

}
