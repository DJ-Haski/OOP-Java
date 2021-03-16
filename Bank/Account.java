package Bank;

public class Account {

    private double balance; 
    private int accNumber; 

    public Account (int num)
    { 
        balance = 0.0;
        accNumber = num; 
    } 
    public void deposit (double sum)
    { 
    	balance = balance + sum;
    	System.err.println(sum+"$ added to account's balance!");
    }
    public void withdraw (double sum)
    {
        if (balance > 0) {
            balance = balance - sum;
            System.err.println(sum+"$ withdrawed from account's balance!");
        }
        else {
            System.err.println("Error!Check your balance! ");
        }
    }
    public double getBalance() 
    { 	
    	System.err.println("Balance is: $");
        return balance; 
    }
    public double getAccountNumber()
    {
    	System.err.println("Account number is: ");
        return accNumber;
    }
    
  
    public String toString()
    {
      return "Your account's id is: " + accNumber + ". You have: "+ balance+"$ on your account!";   
    }
    
    public final void print()
    {
           System.out.println( toString()); 
    }

}