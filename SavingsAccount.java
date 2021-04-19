package lab4.task1;

public class SavingsAccount extends Account {
  final double minimumBalance = 500;
  
  public void withDraw(double amount) {
	  if(balance > minimumBalance) {
		  balance -= amount;
		  if(balance < minimumBalance)
			  balance += amount;
	  }
  }
  
  
}
