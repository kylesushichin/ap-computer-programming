public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;
    protected int vacation = 14;
    
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);
        
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    
    public String toString()
    {
        String result  = super.toString();
        
        result += "\nSocial Security Number: " + socialSecurityNumber;
        
        return result;
    }
    
    public double pay()
    {
        return payRate;
    }
    
    public String Vacation()
    {
        int vaca = vacation;
        String other = "Amount of vacation days: ";
        other += vaca;
        return other;
    }
}