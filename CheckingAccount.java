/*
 * Name:        James Horton
 * Date:        11/13/2018
 * Assignment:  Exam 2 Account Inheritance Hierarchy
 * File:        CheckingAccount.java
 */
package accountinheritancehierarchyexam2;

/**
 *
 * @author Redindianfred
 */
public class CheckingAccount extends Account
{
    static double transFee = 0.25;
    
    public CheckingAccount(double init)
    {
        super(init);
    } // end of balance
    
    @Override
    public boolean Credit(double dep)
    {
        boolean gaveMoney = super.Credit(dep);      // calls account credit and recieves boolean back
        if (gaveMoney)                              // tests boolean 
        {
            double bal = getBalance();              // gets balance and 
            bal = bal - transFee;                   // now applies transaction fee
            setBalance(bal);                        // sets new balance 
        }
        return true;            // returns a val to match overriden call
    } // end of credit account
    
    @Override
    public boolean Debit(double wthDrw)
    {
        boolean gotMoney = super.Debit(wthDrw);     // calls account debit and recieves boolean back
        //System.out.println(gotMoney);
        if (gotMoney)                               // test boolean
        {
            double bal = getBalance();              // gets updated balance
            setBalance(bal - transFee);             // updates applying the transaction fee
            //System.out.println("bal is " + bal);
            
        } // end if if they gots paid
        else
        {
            System.out.println("No money withdrawn");   // explains no transaction was done
        }
        return true;                                 // returns a val to match overriden call
    } // end of Debit

    
} // end of CheckingAccount class
