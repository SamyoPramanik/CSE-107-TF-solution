// Five Keywords are: 
// •	try
// •	catch
// •	finally
// •	throw
// •	throws

import java.util.Scanner;

class InvalidAmountException extends Exception
{
    String msg;
    InvalidAmountException()
    {
        this.msg = "The given amount can't be negative";
    }
    InvalidAmountException(String msg) // To give custom message
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return "InvalidAmountException: " + msg;
    }
}

class InvalidBalanceException extends Exception
{
    String msg;
    InvalidBalanceException()
    {
        this.msg = "The account balance can't be less than zero";
    }
    InvalidBalanceException(String msg) // To give custom message
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return "InvalidBalanceException: " + msg;
    }
}

class Account
{
    private double balance;

    public void setInitialBalance (double amount) 
    {
        try
        {
            if(amount<0)
            {
                throw new InvalidAmountException();
            }
            else
            {
                this.balance = amount;
            }
        }
        catch(InvalidAmountException e)
        {
            System.out.println(e);
        }
    }
    void debit (double amount)
    {
        try
        {
            if(amount>balance)
            {
                throw new InvalidBalanceException();
            }
            else if(amount<0)
            {
                throw new InvalidAmountException();
            }
            else
            {
                this.balance -= amount;
            }
        }
        catch(InvalidAmountException | InvalidBalanceException e)
        {
            System.out.println(e);
        }
    }
    void credit (double amount)
    {
        try
        {
            if(amount<0)
            {
                throw new InvalidAmountException();
            }
            else
            {
                this.balance += amount;
            }
        }
        catch(InvalidAmountException e)
        {
            System.out.println(e);
        }
    }
}
public class Ques1B {
    // main given for convenience
    public static void main(String[] args) { 
        Account account = new Account();
        
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Set Initial Balance");
            System.out.println("2. Debit");
            System.out.println("3. Credit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice==1)
            {
                System.out.print("Amount: ");
                account.setInitialBalance(sc.nextDouble());
                sc.nextLine();
            }
            else if(choice==2)
            {
                System.out.print("Amount: ");
                account.debit(sc.nextDouble());
                sc.nextLine();
            }
            else if(choice==3)
            {
                System.out.print("Amount: ");
                account.credit(sc.nextDouble());
                sc.nextLine();
            }
            else
            {
                break;
            }
        }
    }
}
