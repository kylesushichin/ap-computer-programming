public class Transactions
{
    public static void main(String args[])
    {
        Account acct1 = new Account("Ted Murphy", 72354);
        Account acct2 = new Account("Jane Smith", 12341);
        Account acct3 = new Account("Edward Demsey", 76541);
        
        acct1.deposit(25.86);
        
        double smithBalance= acct2.deposit(500.00);
        System.out.println("Smith balance after withdrawal: " + acct2.withdraw (430.75, 1.50));
        
        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();
        
        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
        
    }
}