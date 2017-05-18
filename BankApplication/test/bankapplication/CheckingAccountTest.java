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
public class CheckingAccountTest {
    
    public CheckingAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of withdrawMoney method, of class CheckingAccount.
     */
    @Test
    public void testWithdrawMoney() {
        System.out.println("withdrawMoney");
        int n = 50;
        CheckingAccount instance = new CheckingAccount("Jeff", 100);
        double expResult = 49.9;
        double result = instance.withdrawMoney(n);
        assertEquals(expResult, result, 0.0);
    }
    
}
