package bankapplication;
import java.util.*;

public class ListOfAccounts {
    
    ArrayList<Account> list;
    
    public ListOfAccounts() {
        this.list = new ArrayList<Account>();
    }
    
    public void addAccount(Account acc){
        list.add(acc);
        
    }
    
    public void removeAccount(Account acc){
        list.remove(acc);
    }
    
    
    
    
    
}
