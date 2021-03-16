package Bank;

public class SavingsAccount extends Account { 
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate=interestRate;
    }

    public double doInterest() { 
        double newBalance = getBalance() + (getBalance()*interestRate);
        return newBalance;
        
    }
    public void addInterest (double interestRate) { 
        double sum = super.getBalance() * interestRate; 
        super.deposit(sum);
    }
    @Override
    public String toString() {
        return super.toString()+" Your current interest is: " + (interestRate*100)+"%"; 
    }
}
