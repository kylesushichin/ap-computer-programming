import java.util.*;
public class Demographic
{
    public static void main(String args[])
    {
        Random gen = new Random();
        
        AverageAge a = new AverageAge(gen.nextInt(25)+20);
        Nationality b = new Nationality();
        CommonJob c = new CommonJob();
        AverageIncome d = new AverageIncome(gen.nextInt(35000)+30000);
        
        System.out.println("In area A, the average demographic statistics are...");
        a.setAge();
        b.setNationality();
        c.getCommonJob();
        d.setIncome();
    }
}