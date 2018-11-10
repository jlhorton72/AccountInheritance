/*
 * Name:        James Horton
 * Date:        11/13/2018
 * Assignment:  Exam 2 Account Inheritance Hierarchy
 * File:        Account.java
 */
package accountinheritancehierarchyexam2;

/**
 *
 * @author Redindianfred
 */
public class Account 
{
    private double balance;
    protected int acntNum;
    static int masterAccnt = 100;
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAcntNum() {
        return acntNum;
    }

    public void setAcntNum(int acntNum) {
        this.acntNum = acntNum;
    }
            
    public Account(double init)
    {
        if (getBalance() > 0)           // if balance exists
        {
            System.out.println("Account exists");
        } // end of if
        else 
        {
            // create account here and increment account number since account doesn't exist
            if (init >=0)               // if deposit is positive
            {
                masterAccnt = masterAccnt + 15;
                this.acntNum = masterAccnt;
                this.balance = init;
            } // end of if positive money
            else
            {
                                    // if deposit wasn't positive
                System.out.println("Please make an initial deposit to start an account");
            } // end of else negative money
        } // end of else
        
    } // end of Account 'creation'
    
    public boolean Credit(double dep)
    {
        double bal = getBalance();           // gets current balance
        setBalance(bal + dep);              // set new balance 
        return true;                        // returns true because depo was made
    } // end of credit account
    
    public boolean Debit(double wthDrw)
    {
        double bal = getBalance();          // gets balance
        if (bal < wthDrw)                   // if this will overdraw the account
        {
            System.out.println("Debit amount exceeded acount balance");
            return false;                   // returns boolean for chking usage
        } // end of if enough money
        else
        {
                                    // if had enough, make the withdraw
            setBalance(bal - wthDrw);
            return true;                    // returns boolean for chk usage
        } // updates the balance by withdrawal
               
    } // end of wthDrw
    
    public double Balance()
    {
                // decided to print the balance here vs. extra lines in main
                // thinking like reciept view or screen view 
        double bal = getBalance();
        System.out.printf("The current balance is: %.2f", bal);
        System.out.println("");
        return bal;                 // returns to meet params of exam
    } // end of checkBalance
}  // end oc class Account
