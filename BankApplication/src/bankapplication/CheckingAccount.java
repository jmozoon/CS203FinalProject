package bankapplication;


public class CheckingAccount extends Account{
    
    public CheckingAccount(String name, int balance){
        super(name, balance);
    }
    
    public double withdrawMoney(int n){
        double newBalance = balance - n - .1;
        return newBalance;
    }
    
    
    
    
    
    
}
