package bankapplication;

public class Account {
    
    public String name;
    public double balance;
    
    
    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
        
    }
    
    /**
     *Gets the account name
     * @return the account name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Gets the account balance
     * @return the account balance
     */
    public double getBalance(){
        return balance;
    }
    
    /**
     * Sets the account name
     * @param n 
     */
    public void setName(String n){
        name = n;
    }
    
    /**
     * Sets the account balance
     * @param b 
     */
    public void setBalance(double b){
        balance = b;
    }
    
    
    /**
     * Subtracts the inputed amount from the account balance and 
     * returns the inputed amount
     * @param n
     * @return 
     */
    public double withdrawMoney(int n){
        double newbalance = balance - n;
        balance = newbalance;
        
        return balance;
    }
    
    /**
     * Adds the inputed amount to the account balance and
     * returns the inputed amount
     * @param n
     * @return 
     */
    public double depositMoney(int n){
        double newbalance = balance + n;
        balance = newbalance;
        
        return balance;
    }
    
    
    
    
    
    
    
}
