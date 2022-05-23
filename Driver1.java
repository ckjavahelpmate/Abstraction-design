
package Abstraction;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		KotakBank k=new KotakBank();
		Scanner sc=new Scanner(System.in);
		System.out.println("acno");
		int acno=sc.nextInt();
		System.out.println("name");
		String name=sc.nextLine();sc.next();
		System.out.println("bal");
		double bal=sc.nextDouble();
		System.out.println("uname");
		String uname=sc.nextLine();sc.next();
		System.out.println("cno");
		int cno=sc.nextInt();
		k.createAccount(acno, uname, bal, new User(uname,cno));
		

	}

}
