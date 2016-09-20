import java.util.Scanner;
public class Speed_Time
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        float speed;
        float distance;
        float time;
        
        System.out.print("(Speed = meters/Seconds) Enter amount of speed in a whole number: ");
        speed = scan.nextFloat();
        System.out.print("Enter amount of distance in meters: ");
        distance = scan.nextFloat();
        
        time = distance / speed;
        
        System.out.println(time + " seconds");
    }
}