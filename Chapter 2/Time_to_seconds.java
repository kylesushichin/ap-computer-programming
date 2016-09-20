import java.util.Scanner;
public class Time_to_seconds
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        final int HOURS;
        final int MINUTES;
        final int SECONDS;
        int hours;
        int minutes;
        int time;
    
        System.out.print("Enter an amount of time in hours, minutes, and seconds\n ");
        System.out.println("");
        
        System.out.print("Hours: ");
        HOURS = scan.nextInt();
        hours = HOURS * 3600;
        
        System.out.print("Minutes: ");
        MINUTES = scan.nextInt();
        minutes = MINUTES*60;
        
        System.out.print("Seconds: ");
        SECONDS = scan.nextInt();
        time = hours + minutes + SECONDS;
        
        
        System.out.print("time in seconds = " + time);
        
    }
}