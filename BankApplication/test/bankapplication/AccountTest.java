/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jomozoon
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Account.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Account instance = new Account("Jeff", 100);
        String expResult = "Jeff";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account instance = new Account("Jeff", 100);
        double expResult = 100;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setName method, of class Account.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "Clark";
        Account instance = new Account("Jeff", 100);
        instance.setName(n);

    }

    /**
     * Test of setBalance method, of class Account.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double b = 200;
        Account instance = new Account("Jeff", 100);
        instance.setBalance(b);

    }

    /**
     * Test of withdrawMoney method, of class Account.
     */
    @Test
    public void testWithdrawMoney() {
        System.out.println("withdrawMoney");
        int n = 50;
        Account instance = new Account("Jeff", 100);
        double expResult = 50;
        double result = instance.withdrawMoney(n);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of depositMoney method, of class Account.
     */
    @Test
    public void testDepositMoney() {
        System.out.println("depositMoney");
        int n = 50;
        Account instance = new Account("Jeff", 100);
        double expResult = 150;
        double result = instance.depositMoney(n);
        assertEquals(expResult, result, 0.0);

    }
    
}
