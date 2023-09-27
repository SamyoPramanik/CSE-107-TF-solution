

class InvalidAmountException extends Exception{
    String details;

    InvalidAmountException(String str){
        details = str;
    }

    @Override
    public String toString(){
        return "InvalidAmountException: " + details;
    }
}

class InvalidBalanceException extends Exception{
    
    InvalidBalanceException(){
    }
    @Override
    public String toString(){
        return "InvalidBalanceException: Balance cannot be negative";
    }
}



// Note: If you wanted you could have also handled the exceptions at the Account class
// Since the question doesn't mention where to handle it I have decided to handle it in the main function

class Account{
    double balance;

    Account(double balance){
        this.balance = balance;
    }

    void debit(double amount) throws InvalidAmountException, InvalidBalanceException{
        try{
            if(amount < 0){
                throw new InvalidAmountException("Debit Amount Cannot Be negative");
            }
            else if(amount > balance){
                throw new InvalidBalanceException();
            }
        }
        catch(InvalidAmountException e){
            throw e;
        }
        catch(InvalidBalanceException e){
            throw e;
        }

        balance -= amount;
    }

    void credit(double amount) throws InvalidAmountException{
        try{   
            if(amount < 0){
                throw new InvalidAmountException("Credit Cannot be Negative");
            }
        } catch(InvalidAmountException e){
            throw e;
        }

        balance += amount;
    }

    double getBalance(){
        return balance;
    }
}


public class TF_2016_2017_3b {
    public static void main(String[] args) {
        // i have only written the main code so that you can test it. You don't need to write it in the answer script
        Account acc = new Account(100);

        try{
            System.out.println(acc.getBalance());
            acc.debit(90);
            System.out.println(acc.getBalance());
            // acc.credit(-10); // this line throws an exception
            // acc.debit(-20); // this line throws an exception

            acc.credit(50);
            System.out.println(acc.getBalance());
            acc.debit(30);
            // acc.debit(70); // this line throws an exception
            System.out.println(acc.getBalance());

        }
        catch(InvalidAmountException e){
            e.printStackTrace();
        }
        catch(InvalidBalanceException e){
            e.printStackTrace();
        }
    }
}
