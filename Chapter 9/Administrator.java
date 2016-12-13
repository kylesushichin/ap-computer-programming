public class Administrator extends Employee//pp2
{
    public Administrator(String Job)
    {
        super(Job);
    }
    
    public void getJob()
    {
        super.getJob();
        System.out.println("\"I pay people\"");
    }
}