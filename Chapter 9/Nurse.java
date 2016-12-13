public class Nurse extends Doctor//pp2
{
    public Nurse(String job)
    {
        super(job);
    }
    
    public void getJob()
    {
        super.getJob();
        System.out.println("\"I help heal people\"");
    }
}