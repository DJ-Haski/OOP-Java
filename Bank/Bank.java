package Bank;

public class Bank {

    public static void main(String[] args) {
    	Account[] accounts = new Account[2];
    	accounts[0] = new CheckingAccount(2, 20);
    	accounts[1] = new SavingsAccount(1, 10);
    	
    }
    public void update() {
    	
    }
}