package com.prienc;

public class TestBank {
	public void test(double balance) throws BankATMException{
		if(balance<10000.00){
			throw new BankATMException();
			
		}
		else{
			System.out.println("You do not have sufficient fund for this transcation");
		}
	}
	
}
