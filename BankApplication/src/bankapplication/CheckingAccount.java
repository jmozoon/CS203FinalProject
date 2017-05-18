package bankapplication;


public class CheckingAccount extends Account{
    
    public CheckingAccount(String name, double balance){
        super(name, balance);
    }
    
    /**
     * Subtracts the inputed amount from the account balance and
     * returns the inputed amount
     * @param n
     * @return 
     */
    public double withdrawMoney(int n){
        double newBalance = balance - n - .1;
        return newBalance;
    }
    
    
    
    
    
    
}
