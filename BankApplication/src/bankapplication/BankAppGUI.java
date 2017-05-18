package bankapplication;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class BankAppGUI {
    
    ListOfAccounts list;
    
    public BankAppGUI(ListOfAccounts list) {
    
        this.list = list;
        
    //Create the frame, panels, and additional functionality  
    JFrame frame = new JFrame();
    
    
    //For creating and deleting accounts
    JPanel northpanel = new JPanel();
    JTextField newaccountname = new JTextField(15);
    JLabel newlabel = new JLabel("Create Account:");
    newaccountname.setText("Enter Name");
    JButton newsavingsbutton = new JButton("Open A Savings Account");
    JButton newcheckingbutton = new JButton("Open A Checking Account");
    
    JTextField deleteaccount = new JTextField(15);
    deleteaccount.setText("Enter Name");
    JLabel deletelabel = new JLabel("Delete Account:");
    
    //For depositing and withdrawing money
    JPanel centerpanel = new JPanel();
    JTextField accountnamefield = new JTextField(15);
    JLabel accountnamelabel = new JLabel("Account Name:");
    accountnamelabel.setFont(new Font("Courier New", Font.BOLD, 14));
    JTextField depositfield = new JTextField(5);
    JLabel dflabel = new JLabel("Enter Deposit Amount Here:");
    dflabel.setFont(new Font("Courier New", Font.ITALIC, 14));
    JTextField withdrawfield = new JTextField(5);
    JLabel wflabel = new JLabel("Enter Withdraw Amount Here:");
    wflabel.setFont(new Font("Courier New", Font.ITALIC, 14));
    JButton depositbutton = new JButton("Submit");
    JButton withdrawbutton = new JButton("Submit");
    
    //For searching and displaying accounts
    JPanel southpanel = new JPanel();
    JButton savingsaccountlist = new JButton("Display Savings Accounts");
    JButton checkingaccountlist = new JButton("Display Checking Acounts");
    JTextField searchfield = new JTextField(15);
    JButton searchbutton = new JButton("Search By Name");
    
    
    
    
    //Set the layout and add the features to the panels
    northpanel.setLayout(new FlowLayout());
    northpanel.add(newlabel, 0);
    northpanel.add(newaccountname, 1);
    northpanel.add(newsavingsbutton, 2);
    northpanel.add(newcheckingbutton, 3);
    northpanel.add(accountnamelabel, 4);
    northpanel.add(accountnamefield, 5);
    
    
  
    
    centerpanel.setLayout(new FlowLayout());
    centerpanel.add(accountnamelabel, 0);
    centerpanel.add(accountnamefield, 1);
    centerpanel.add(dflabel, 2);
    centerpanel.add(depositfield, 3);
    centerpanel.add(depositbutton, 4);
    centerpanel.add(wflabel, 5);
    centerpanel.add(withdrawfield, 6);
    centerpanel.add(withdrawbutton, 7);
    
    centerpanel.add(deletelabel, 8);
    centerpanel.add(deleteaccount, 9);
    
    southpanel.setLayout(new FlowLayout());
    southpanel.add(savingsaccountlist, 0);
    southpanel.add(checkingaccountlist, 1);
    southpanel.add(searchfield, 2);
    southpanel.add(searchbutton, 3);
    
    
    
    //Add Panels to the frame
    frame.setLayout(new BorderLayout());
    frame.add(northpanel, BorderLayout.NORTH);
    frame.add(centerpanel, BorderLayout.CENTER);
    frame.add(southpanel, BorderLayout.SOUTH);
    frame.setSize(1100, 200); 
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Bank Application");
    
    
    //Add actionlistners to the buttons
   newsavingsbutton.addActionListener((ActionEvent event) -> {
       String name = newaccountname.getText();
       SavingsAccount newone = new SavingsAccount(name, 0);
       if (!newaccountname.getText().equals("Enter Name")) {
           list.addAccount(newone);
       } 
   });
   
   newcheckingbutton.addActionListener((ActionEvent event) -> {
       String name = newaccountname.getText();
       CheckingAccount newone = new CheckingAccount(name, 0);
       if (!newaccountname.getText().equals("Enter Name")) {
           list.addAccount(newone);
       }
   });
   
   
   
   deleteaccount.addActionListener((ActionEvent event) -> {
       String name = deleteaccount.getText();
       list.removeByString(name);
   });
    
   
   
   depositbutton.addActionListener((ActionEvent event) -> {
       String name = accountnamefield.getText();
       String text = depositfield.getText();
       int deposit = Integer.parseInt(text);
       
       Account transactionaccount = list.getAccount(name);
       transactionaccount.setBalance(transactionaccount.getBalance()+deposit);
       
       
       
   });
    
   withdrawbutton.addActionListener((ActionEvent event) -> {
       String name = accountnamefield.getText();
       String text = withdrawfield.getText();
       double withdraw = Double.parseDouble(text);
     
        
       Account transactionaccount = list.getAccount(name);
       if (transactionaccount instanceof CheckingAccount && transactionaccount == null) {
           transactionaccount.setBalance(transactionaccount.getBalance() - withdraw - .1);
       } else {
           transactionaccount.setBalance(transactionaccount.getBalance() - withdraw);
       }
       
       
       
   });
    

   searchbutton.addActionListener((ActionEvent event) -> {
       String text = searchfield.getText();
       JFrame newframe = new JFrame();
       newframe.setVisible(true);
       newframe.setSize(200, 200);
       newframe.setLayout(new GridLayout(2, 2));
       newframe.setTitle("Account Search");
       
       int i = 0;
       newframe.add(new JLabel("Name:"), i);
       newframe.add(new JLabel("Balance:"), i+1);
       i += 2;
       
       for  (Account a: list.getAccounts()) {
           if (a.getName().equals(text)) {
               String accountname = a.getName();
               double temp = a.getBalance();
               String accountbalance = Double.toString(temp);
               JLabel accountnamestring = new JLabel(accountname);
               newframe.add(accountnamestring, i);
               newframe.add(new JLabel(accountbalance), i+1);
               i +=2;
           }
       }
       
       
   });
   
   
   savingsaccountlist.addActionListener((ActionEvent event) -> {
       JFrame newframe = new JFrame();
       newframe.setVisible(true);
       newframe.setSize(400, 200);
       String savingstitle = "List of Savings Accounts";
       newframe.setTitle(savingstitle);
       
       ArrayList<Account> savingsaccounts = list.getSavingsAccounts();
       int size = savingsaccounts.size();
       
       GridLayout grid = new GridLayout(size+1, 2, 4, 1);
       newframe.setLayout(grid);
       int i = 0;
       newframe.add(new JLabel("Name:"), i);
       newframe.add(new JLabel("Balance:"), i+1);
       i += 2;
       
       for (Account a: savingsaccounts) {
           String accountname = a.getName();
           String accountbalance = String.valueOf(a.getBalance());
           newframe.add(new JLabel(accountname), i);
           newframe.add(new JLabel(accountbalance), i+1);  
           i +=2 ;
       }
   });
   
    checkingaccountlist.addActionListener((ActionEvent event) -> {
       JFrame newframe = new JFrame();
       newframe.setVisible(true);
       newframe.setSize(400, 200);
       String checkingtitle = "List of Checking Accounts";
       newframe.setTitle(checkingtitle);
       
       ArrayList<Account> checkingaccounts = list.getCheckingAccounts();
       int size = checkingaccounts.size();
       
       GridLayout grid = new GridLayout(size+1, 2, 4, 1);
       newframe.setLayout(grid);
       int i = 0;
       newframe.add(new JLabel("Name:"), i);
       newframe.add(new JLabel("Balance:"), i+1);
       i += 2;
       
       for (Account a: checkingaccounts) {
           String accountname = a.getName();
           String accountbalance = String.valueOf(a.getBalance());
           newframe.add(new JLabel(accountname), i);
           newframe.add(new JLabel(accountbalance), i+1);  
           i +=2 ;
       }
   });
   
   
   
}
    


}
