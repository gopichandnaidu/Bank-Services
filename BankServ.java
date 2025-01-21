package Pack1;
import java.util.Scanner;

public class Bankappn {
	String full_name;
	int age;
	String dob;
	String father_name;
	String loc;
	long mob_num;
	long acc_num;
	double balance =0;
	
	public void display() {
		System.out.println("------------------------------------------");
		System.out.println("       Welcome to the BANK Application        ");
		System.out.println(" Lets start with creation of bank account ");
		System.out.println("------------------------------------------");
		create_display();
	}
	
	public void create_display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("Enter Your full name");
		this.full_name = sc.nextLine();
		System.out.println("Enter Your Age");
		this.age = sc.nextInt();
		System.out.println("Enter Date of birth: ");
		this.dob = sc.next();
		System.out.println("Enter Your Father name: ");
		this.father_name = sc.next();
		System.out.println("Enter Your location");
		this.loc = sc.nextLine();
		System.out.println("Create a Bank Mobile Number");
		this.mob_num = sc.nextLong();
		System.out.println("Create a Bank Account Number");
		this.acc_num = sc.nextLong();
		details_display();
	}
	public void details_display() {
		System.out.println("------------------------------------------");
		System.out.println(full_name);
		System.out.println(age);
		System.out.println(dob);
		System.out.println(father_name);
		System.out.println(loc);
		System.out.println(mob_num);
		System.out.println(acc_num);
		double amt = 0;
		operations(amt);
	}
	
	public int operations(double balance) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("What do you want to do (type: deposit, withdraw and balance)");
		String op = sc.nextLine();
		if(op.equals("deposit")){
			deposit();
		}
		else if(op.equals("withdraw")) {
			withdraw();
		}
		else if(op.equals("balance")) {
			balance(balance);
		}
		else {
			System.out.println("Invalid Input");
		}
		return 0;
	}
	
	public double deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("How much money do you want to deposit: ");
		double amt = sc.nextInt();
		balance += amt;
		System.out.println(balance);
		return operations(amt);
	}
	
	public double withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("How much money do you want to withdraw: ");
		double amt = sc.nextInt();
		if(balance>amt) {
			balance -= amt;
			System.out.println(balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
		return operations(amt);
	}
	
	public double balance(double amt) {
		System.out.println("------------------------------------------");
		System.out.println("Balance amount: "+balance);
		return operations(amt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankappn b = new Bankappn();	
		b.display();
	}

}
