package com.prienc;

public class BankAtm {
	int id=0004;
	String bankName="SBI";
	String location="new delhi";
	double balance= 30000.00;
	
	public void withdraw(double amt){
		double newbalance;
		newbalance= balance-amt;
		if(balance-amt<10000){
			try {
				throw new BankATMException();
			} catch (BankATMException e) {
				// TODO Auto-generated catch block
				System.out.println("You can not make this withdrawl your balance is below 10000");
			}
		}else{
			System.out.println("You withdrawl is succesful your new balance is "+ newbalance);
		}
	}
		public void deposit(double amt)	{
			double newBalance= balance+amt;
			System.out.println("Amount deposited new balance is "+ newBalance);
		}
	

	public static void main(String[] args) {
		BankAtm be= new  BankAtm();
		be.deposit(1000.00);
		be.withdraw(1000000.00);
		BankAtm bb= new BankAtm();
		bb.deposit(20000.00);
		bb.withdraw(10000.00);
		BankAtm cc= new BankAtm();
		cc.deposit(87699.98);
		cc.withdraw(980943.00);
		
		// TODO Auto-generated method stub

	}

}
