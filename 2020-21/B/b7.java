class InvalidStockAmountException extends Exception
{
    private double amount;
    InvalidStockAmountException(double amount)
    {
        this.amount = amount;
    }
    @Override
    public String toString()
    {
        return amount + ": The given amount can't be negative\n";
    }
}

class InvalidInventoryStockException extends Exception
{
    private double amount;
    InvalidInventoryStockException(double amount)
    {
        this.amount = amount;
    }
    @Override
    public String toString()
    {
        return amount + ": The stock can't be less than the minimum stock\n";
    }
}

class Inventory
{
    private double stock;
    private double minStock;
    Inventory()
    {
        stock = 0;
        minStock = 0;
    }
    void setInitialStock(double amount) throws InvalidStockAmountException, InvalidInventoryStockException
    {
        if(amount < 0)
        {
            throw new InvalidStockAmountException(amount);
        }
        else if(amount < minStock)
        {
            throw new InvalidInventoryStockException(amount);
        }
        stock = amount;
    }
    void addToInventory(double amount) throws InvalidStockAmountException, InvalidInventoryStockException
    {
        if(amount < 0)
        {
            throw new InvalidStockAmountException(amount);
        }
        else if(amount + stock < minStock)
        {
            throw new InvalidInventoryStockException(amount);
        }
        stock += amount;
    }
    void removeFromInventory(double amount) throws InvalidStockAmountException, InvalidInventoryStockException
    {
        if(amount < 0)
        {
            throw new InvalidStockAmountException(amount);
        }
        else if(stock - amount < minStock)
        {
            throw new InvalidInventoryStockException(amount);
        }
        stock -= amount;
    }
}

public class b7 {
    public static void main(String[] args) {
        Inventory i = new Inventory();
        try {
            i.setInitialStock(100);
            i.addToInventory(50);
            i.removeFromInventory(200);
        } catch (InvalidInventoryStockException | InvalidStockAmountException e) {
            System.out.println(e);
        }
    }
}
