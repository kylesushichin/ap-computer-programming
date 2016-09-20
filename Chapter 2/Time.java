import java.util.Scanner;
public class Time
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        final int time_seconds;
        int seconds;
        int minutes; 
        int hours;
        
        System.out.print("Enter an amount of time in seconds: ");
        time_seconds = scan.nextInt();
        seconds = (time_seconds%3600)%(60)%60;
        minutes = (time_seconds%3600)/60;
        hours = time_seconds/3600;
        
        
        System.out.print(time_seconds + " Seconds is equal to : " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
        
        
    }
}