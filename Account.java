package lab4.task1;

public class Account extends Person {
   private long accountNumber;
   protected double balance;
   private Person accHolder;
   private boolean isStatus;
   
   
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}


public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}


public Person getAccHolder() {
	return accHolder;
}
public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}


  
public boolean isStatus() {
	if(balance < 500)
		return false;
	return true;
}
public void setStatus(boolean isStatus) {
	this.isStatus = isStatus;
}


public void deposit(double amount) {
	balance += amount; 
	
}

public void withDraw(double amount) {
	  balance -= amount;
	
}
   
}
