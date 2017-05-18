package bankapplication;
import java.util.*;

public class ListOfAccounts {
    
    ArrayList<Account> list;
    
    public ListOfAccounts() {
        this.list = new ArrayList<Account>();
    }
    
    /**
     * Adds the account to the list
     * @param acc 
     */
    public void addAccount(Account acc){
        list.add(acc);
        
    }
    
    /**
     * Removes the account from the list
     * @param acc 
     */
    public void removeAccount(Account acc){
        list.remove(acc);
    }
    
    /**
     * Removes the account from the list by the name of the account
     * @param s 
     */
    public void removeByString(String s){
        for (Account a: list ) {
            if (a.getName().equals(s)) {
                list.remove(a);
                break;
            }
       
        }
        
    }
    
    /**
     * Returns a list of savings accounts from the account list
     * @return 
     */
    public ArrayList<Account> getSavingsAccounts(){
        ArrayList<Account> localarray = new ArrayList<>();
        
        for (Account a: list) {
            if (a instanceof SavingsAccount) {
                localarray.add(a);
        }
    }
    
    return localarray;
}
    /**
     * Returns the list of checking accounts from the account list
     * @return 
     */
    public ArrayList<Account> getCheckingAccounts(){
        ArrayList<Account> localarray = new ArrayList<>();
        
        for (Account a: list) {
            if (a instanceof CheckingAccount) {
                localarray.add(a);
        }
    }
    
    return localarray;
}

   /**
    * Returns the list of accounts
    * @return 
    */
   public ArrayList<Account> getAccounts() {
       return list;
       
   }
   
   /**
    * Returns an account by the name of the account
    * @param s
    * @return 
    */
   public Account getAccount(String s) {
       for (Account a: list ) {
            if (a.getName().equals(s)) {
                return a;
            }
       
        }
       return null;
   }
   
   
   
   
}