public class JobAnalyzer//pp2
{
    public static void main(String args[])
    {
        Employee a = new Employee("Employee");
        Doctor b = new Doctor("Doctor");
        Nurse c = new Nurse("Nurse");
        Janitor d = new Janitor("Janitor");
        Administrator e = new Administrator("Administrator");
        
        a.getJob();
        b.getJob();
        c.getJob();
        d.getJob();
        e.getJob();
    }
}