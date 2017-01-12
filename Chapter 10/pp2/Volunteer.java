public class Volunteer extends StaffMember
{
    public Volunteer(String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }
    
    public double pay()
    {
        return 0.0;
    }
    
    public String Vacation()
    {
        return "Amount of vacation days: none";
    }
}