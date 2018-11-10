/*
 * Name:        James Horton
 * Date:        11/13/2018
 * Assignment:  Exam 2 Account Inheritance Hierarchy
 * File:        SavingsAccount.java
 */
package accountinheritancehierarchyexam2;

/**
 *
 * @author Redindianfred
 */
public class SavingsAccount extends Account 
{
    static final double rate = .04;
    
    public SavingsAccount(double init)
    {
        super(init);                        // sends off to create the accnt
    } // end of balance
    
    public double CalculateInterest()
    {
        double bal = getBalance();          // get the balance and then     
        double interest = bal * rate;       //do the math for the interest
                        // returns amount of interest earned, not the new balance
//        setBalance(bal + interest);       // have commented out cause might be beyond scope of assignment        
        
        return interest;
    } // end of calc interest
    
    
} // end of class
