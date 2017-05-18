package bankapplication;
import java.util.*;

public class BankApplication {


    public static void main(String[] args) {
        
        Account customer1 = new SavingsAccount("Barack Obama", 120);
        Account customer2 = new CheckingAccount("Peter Thiel", 270);
        Account customer3 = new CheckingAccount("Jeff Bezos", 820);
        Account customer4 = new SavingsAccount("Steve Wozniak", 800);
        Account customer5 = new SavingsAccount("Michael Bloomberg", 488);
        Account customer6 = new CheckingAccount("Queen Elizabeth", 500);
        Account customer7 = new SavingsAccount("Jack Ma", 311);
        Account customer8 = new SavingsAccount("Kiran Mazumdar-Shaw", 210);
        
        ListOfAccounts customers = new ListOfAccounts();
        customers.addAccount(customer1);
        customers.addAccount(customer2);
        customers.addAccount(customer3);
        customers.addAccount(customer4);
        customers.addAccount(customer5);
        customers.addAccount(customer6);
        customers.addAccount(customer7);
        customers.addAccount(customer8);
        
        BankAppGUI GUI = new BankAppGUI(customers);
        
        
        
        
        
        
    }
    
}
