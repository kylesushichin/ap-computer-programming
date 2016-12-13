import java.util.Random;
public class CommonJob
{
    Random thing = new Random();
    public void getCommonJob()
    {
        int y = thing.nextInt(3)+1;
        switch (y)
        {
            case 1:
                System.out.println("The most common job is a software engineer");
                break;
            case 2:
                System.out.println("The most common job is a game designer");
                break;
            case 3: 
                System.out.println("The most common job is a janitor");
                break;
        }
    }
}