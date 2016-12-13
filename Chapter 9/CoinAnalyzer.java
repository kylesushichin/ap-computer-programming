public class CoinAnalyzer//pp1
{
    public static void main(String args[])
    {
        MonetaryCoin a = new MonetaryCoin(25);
        MonetaryCoin b = new MonetaryCoin(10);
        MonetaryCoin c = new MonetaryCoin(5);
        MonetaryCoin d = new MonetaryCoin(1);
        
        int sum = a.getvalue() + b.getvalue() + c.getvalue() + d.getvalue();
        a.flip();
        b.flip();
        
        System.out.println("Sum of the coins are: " + sum);
        System.out.println("Coin A is " + a.toString() + " Coin B is " + b.toString());
    }
}