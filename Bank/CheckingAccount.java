package Bank;

public class CheckingAccount extends Account {
    private double freeTransactions;
	private double fee; 

    public CheckingAccount(int accNumber, double freeTransactions) {
        super(accNumber);
        this.freeTransactions = freeTransactions;
    }

    public double getFreeTransactions() {
        return this.freeTransactions;
    }

    public void setFreeTransactions(double freeTransactions) { 
        this.freeTransactions=freeTransactions; 
    }
    public double deductFee(double fee) {
    	return fee;
    }
    public void withdraw (double freeTransactions,double sum) { 
        if (freeTransactions <= this.freeTransactions) {
            super.withdraw(sum);
            freeTransactions = freeTransactions - 1;
        }
        else { 
        	System.out.println(" No more free transactions left. You will be charged extra 2 cents!");
        	super.withdraw((sum+deductFee(fee)));
            
        }
    }

    @Override
    public String toString() { 
        return super.toString() +"You have : "+freeTransactions+" free transactions availible."; 
    }
}