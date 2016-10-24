import java.text.NumberFormat;

public class Account
{
    private final double RATE = 0.035;
    
    private long acctNumber;
    private double balance;
    private String name;
    
    public Account(String owner, long account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    public double deposit(double amount)
    {
        if( amount > 0 )
        {
            balance = balance + amount;
            return balance;  
        }
        else
        {
            System.out.println("Error, Can not deposit amount lower than 0.");    
            return balance;
        }
    }
    
    public double withdraw(double amount, double fee)
    {
        if(amount < balance)
        {
            balance = balance - amount - fee;
            return balance;
        }
        else
        {
            System.out.println("Error, Can not withdraw amount higher than balance.");
            return balance;
        }
            
        
    }
    
    public double addInterest()
    {
        balance += (balance * RATE);
        return balance;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }
}