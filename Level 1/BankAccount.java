public class BankAccount{
	
	public int accountNumber;
	protected String accountHolder;
	private int balance;
	
	BankAccount(int accountNumber, String accountHolder, int balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public String getHoldername(){
		return accountHolder;
	}
	
	public void setbalance(int balance){
		this.balance = balance;
	}
	
	public int getbalance(){
		return balance;
	}
	
	public static void main(String[] args){
	
		SavingsAccount p1 = new SavingsAccount(51, "Kshitij", 10000);
		p1.display();
	}
}

class SavingsAccount extends BankAccount{
	
	SavingsAccount(int accountNumber, String accountHolder, int balance){
		super(accountNumber, accountHolder, balance);
		setbalance(10);
	}
	
	void display(){
		System.out.println("Accounut Number: "+accountNumber);
		System.out.println("Accounut Holder Name: "+getHoldername());
		System.out.println("Balance: "+ getbalance());
	}
}