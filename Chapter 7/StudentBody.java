public class StudentBody
{
    public static void main(String args[])
    {
        
        Student john = new Student("John", "Smith",0,0,0);
        
        john.setTestScore(1, 5);
        john.setTestScore(2, 20);
        john.setTestScore(3, 100);
        
        System.out.println(john.toString());
    }
}