public class DeviceAnalyzer
{
    public static void main(String args[])
    {
        Computer a = new Computer("Computer");
        CellPhone b = new CellPhone("CellPhone");
        Pager c = new Pager("Pager");
        
        a.getDevice();
        b.getDevice();
        c.getDevice();
    }
}