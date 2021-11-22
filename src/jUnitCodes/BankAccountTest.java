package jUnitCodes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jUnitCodes.BankAccount.InsufficientBalanceException;

class BankAccountTest 
{
	BankAccount b1;
	@Test
		public void insufficientCheckTest() 
		{ 
		BankAccount b1=new BankAccount(20000);
		  assertThrows(InsufficientBalanceException.class,()->b1.withdraw(30000));
		} 
	
}
