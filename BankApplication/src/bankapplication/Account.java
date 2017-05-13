package bankapplication;

public class Account {
    
    public String name;
    public int balance;
    
    
    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setBalance(int b){
        balance = b;
    }
    
    public double withdrawMoney(int n){
        return balance -= n;
    }
    
    public int depositMoney(int n){
        return balance += n;
    }
    
    
    
    
    
}
