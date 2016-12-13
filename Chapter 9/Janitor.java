public class Janitor extends Employee//pp2
{
    public Janitor(String Job)
    {
        super(Job);
    }
    
    public void getJob()
    {
        super.getJob();
        System.out.println("\"I clean things\"");
    }
}