import java.io.*;
public class ATMInterface {
    public static void displaybalance(int balance)
    {
        System.out.println("Current Balance:"+balance);
        System.out.println();
    }
    public static int amountWithdrawing(int balance,int withdrawAmount)
    {
        System.out.println("Withdrawn Operation");
        System.out.println("Withdrawing Amount:"+withdrawAmount);
        if (balance >= withdrawAmount)
        {
            balance=balance-withdrawAmount;
            System.out.println("Please collect your money and card");
            displaybalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }
    public static int amountDepositing(int balance,int depositAmount)
    {
        System.out.println("Deposit Operation");
        System.out.println("Depositing Amount:"+depositAmount);
        balance=balance+depositAmount;
        System.out.println("Your money has been Successfully deposited");
        displaybalance(balance);
        return balance;
    }
    public static void main(String args[])
    {
        int balance=10000;
        int withdrawAmount=5000;
        int depositAmount=2000;
        displaybalance(balance);
        balance=amountWithdrawing(balance,withdrawAmount);
        balance=amountDepositing(balance,depositAmount);
    }
}
