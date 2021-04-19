package lab4.task1;

public class CurrentAccount extends Account{
	private double overDraftLimit;
	private boolean isOverDraftLimitReached;
	
	
	
  public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}



	public boolean isOverDraftLimitReached() {
		
		return isOverDraftLimitReached;
	}



	public void setOverDraftLimitReached(boolean isOverDraftLimitReached) {
		this.isOverDraftLimitReached = isOverDraftLimitReached;
	}



public void withDraw(double amount) {
	        balance -= amount;
	        if(balance == overDraftLimit)
	        	isOverDraftLimitReached = true;
	        else
	           isOverDraftLimitReached = false;
	   
  }
}
