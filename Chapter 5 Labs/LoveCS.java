// JavaScript File// ****************************************************************
// LoveCS.java
//
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************
import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //final int LIMIT = 10;
        int limit;
        int count = 1;
        int sum = 0;
        
        System.out.println("How many times do you want to print the statement out?");
        limit = scan.nextInt();
        
        while (count <= limit)
        {
            System.out.println(count + " I love Computer Science!!");
            count++;
            sum += count - 1;
        }
        System.out.println("Printed this message " + limit + " times. The sum of the numbers from 1 to " + limit + " is " + sum + ".");
    }
}