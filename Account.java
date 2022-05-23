package Abstraction;

public class Account {
	int acno;
	String pwd;
	double bal;
	User u;
	public Account() {}
	public Account(int acno, String pwd, double bal, User u) {
		super();
		this.acno = acno;
		this.pwd = pwd;
		this.bal = bal;
		this.u = u;
	}

}
