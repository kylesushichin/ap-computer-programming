import java.util.Random;
public class Nationality
{
    Random thing = new Random();
    
    public void setNationality()
    {
        int y = thing.nextInt(3)+1;
        switch (y)
        {
            case 1:
                System.out.println("The average nationality is black");
                break;
            case 2:
                System.out.println("The average nationality is caucasian");
                break;
            case 3: 
                System.out.println("The average nationality is asian");
                break;
        }
    }
}