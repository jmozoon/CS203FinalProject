package bankapplication;
import java.util.*;

public class BankApplication {


    public static void main(String[] args) {
        
        Account customer1 = new Account("Peter", 1000);
        Account customer2 = new Account("Lisa", 500);
        Account customer3 = new Account("Obama", 800);
        
        ListOfAccounts customers = new ListOfAccounts();
        customers.addAccount(customer1);
        customers.addAccount(customer2);
        customers.addAccount(customer3);
        
        BankAppGUI GUI = new BankAppGUI(SOMETHINGHERE);
        
        
        
        
        
        
    }
    
}
