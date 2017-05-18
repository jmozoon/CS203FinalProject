/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jomozoon
 */
public class ListOfAccountsTest {
    
    public ListOfAccountsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addAccount method, of class ListOfAccounts.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account acc = new Account("Jeff", 100);
        ListOfAccounts instance = new ListOfAccounts();
        instance.addAccount(acc);

    }

    /**
     * Test of removeAccount method, of class ListOfAccounts.
     */
    @Test
    public void testRemoveAccount() {
        System.out.println("removeAccount");
        Account acc = new Account("Clark", 100);
        ListOfAccounts instance = new ListOfAccounts();
        instance.removeAccount(acc);

    }

    /**
     * Test of removeByString method, of class ListOfAccounts.
     */
    @Test
    public void testRemoveByString() {
        System.out.println("removeByString");
        String s = "Jeff";
        ListOfAccounts instance = new ListOfAccounts();
        instance.removeByString(s);

    }

    /**
     * Test of getSavingsAccounts method, of class ListOfAccounts.
     */
    @Test
    public void testGetSavingsAccounts() {
        System.out.println("getSavingsAccounts");
        ListOfAccounts instance = new ListOfAccounts();
        Account customer1 = new SavingsAccount("Jeff", 100);
        instance.addAccount(customer1);
        ArrayList<Account> expResult = new ArrayList<Account>();
        expResult.add(customer1);
        ArrayList<Account> result = instance.getSavingsAccounts();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCheckingAccounts method, of class ListOfAccounts.
     */
    @Test
    public void testGetCheckingAccounts() {
        System.out.println("getCheckingAccounts");
        ListOfAccounts instance = new ListOfAccounts();
        Account customer1 = new CheckingAccount("Jeff", 100);
        instance.addAccount(customer1);
        ArrayList<Account> expResult = new ArrayList<Account>();
        expResult.add(customer1);
        ArrayList<Account> result = instance.getCheckingAccounts();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAccounts method, of class ListOfAccounts.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("getAccounts");
        ListOfAccounts instance = new ListOfAccounts();
        Account customer1 = new CheckingAccount("Jeff", 100);
        Account customer2 = new SavingsAccount("Martha", 50);
        instance.addAccount(customer1);
        instance.addAccount(customer2);
        ArrayList<Account> expResult = new ArrayList<Account>();
        expResult.add(customer1);
        expResult.add(customer2);
        ArrayList<Account> result = instance.getAccounts();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAccount method, of class ListOfAccounts.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        String s = "Jeff";
        ListOfAccounts instance = new ListOfAccounts();
        Account customer1 = new CheckingAccount("Jeff", 100);
        Account customer2 = new SavingsAccount("Claire", 200);
        instance.addAccount(customer1);
        instance.addAccount(customer2);
        Account expResult = customer1;
        Account result = instance.getAccount(s);
        assertEquals(expResult, result);

    }
    
}
