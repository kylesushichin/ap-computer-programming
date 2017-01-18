public class Commission extends Hourly
{
    private double sales;
    private double commissionRate;
    
    
    //System.out.printf("%.1f", X);
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = cRate;
    }

    public void addSales (double sales)
    {
        this.sales = sales;
        sales = 0; 
    }
    public double pay()
    {
        double totalSales = sales * commissionRate;
        double payment = super.pay() + totalSales;
        
        return payment;
    }
    
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: " + sales;
        return result;
    }
    
    public String Vacation()
    {
        return "Amount of vacation days: none";
    }
}