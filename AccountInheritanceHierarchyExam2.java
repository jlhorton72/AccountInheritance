/*
 * Name:        James Horton
 * Date:        11/13/2018
 * Assignment:  Exam 2 Account Inheritance Hierarchy
 * File:        AccountInheritanceHierarchyExam2.java
 */
package accountinheritancehierarchyexam2;

/**
 *
 * @author Redindianfred
 */
public class AccountInheritanceHierarchyExam2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
       String brk = "**********************************"; 
       Account acct1 = new Account(50.0);
       acct1.Credit(200);
       acct1.Debit(60);
       System.out.println("Accout num: " + acct1.acntNum );
       System.out.println("Balance is: " + acct1.getBalance());
        System.out.println(brk);
       
       
       Account acct2 = new Account(600.0);
       acct2.Credit(200);
       acct2.Debit(60);
       System.out.println("Accout num: " + acct2.acntNum );
       System.out.println("Balance is: " + acct2.getBalance());
       System.out.println(brk);
       
       SavingsAccount sav = new SavingsAccount(3500);
       sav.Credit(150.00);
       System.out.println("Accout num: " + sav.acntNum );
       System.out.println("Balance is: " + sav.getBalance());
       System.out.println(brk);
       System.out.println("try to withdraw 4500");
       sav.Debit(4500);
       System.out.println("Accout num: " + sav.acntNum );
       System.out.println("Balance is: " + sav.getBalance());
       sav.Balance();
       System.out.println(brk);
       double earnings = sav.CalculateInterest();
       sav.Credit(earnings);
       System.out.println("The intereest was : " + earnings);
       sav.Balance();
       System.out.println(brk);
       
       
       CheckingAccount chk = new CheckingAccount(20);
       chk.Credit(3500);
       System.out.println("Accout num: " + chk.acntNum );
       System.out.printf("Balance is: $ %.2f\n", chk.getBalance());
       chk.Debit(25);
       System.out.println("Accout num: " + chk.acntNum );
       System.out.printf("Balance is: $ %.2f\n", chk.getBalance());
       
       
       
    }  // end of main
    
} // end of class
