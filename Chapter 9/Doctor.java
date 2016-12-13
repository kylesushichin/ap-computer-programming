public class Doctor extends Employee//pp2
{
    public Doctor(String title)
    {
        super(title);
    }
    
    public void getJob()
    {
        super.getJob();
        System.out.println("\"I heal people\"");
    }
}