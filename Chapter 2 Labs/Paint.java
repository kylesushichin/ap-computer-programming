//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        int length, width, height, doors, windows, doorspace, windowspace;//declare integers length, width, and height;
        double totalSqFt; //double totalSqFt;
        double paintNeeded;//declare double paintNeeded;
        Scanner scan = new Scanner(System.in);//declare and initialize Scanner object
        
        System.out.print("Enter a value for the length of the room: ");
        length = scan.nextInt();//Prompt for and read in the length of the room
        System.out.print("Enter a value for the width of the room: ");
        width = scan.nextInt();//Prompt for and read in the width of the room
        System.out.print("Enter a value for the height of the room: ");
        height = scan.nextInt();//Prompt for and read in the height of the room
        System.out.print("Enter an amount of doors: ");
        doors = scan.nextInt();
        System.out.print("Enter an amount of windows: ");
        windows = scan.nextInt();
        
        doorspace = doors * 20;
        windowspace = windows * 15;
        
        totalSqFt = ((length * width * height) - (length*width)) - windowspace - doorspace;//Compute the total square feet to be painted--think
        //about the dimensions of each wall
        paintNeeded = totalSqFt / COVERAGE;//Compute the amount of paint needed
        System.out.println("The length is: " + length + " the width is: " + width + " the height is: " + height + " there needs to be : " + paintNeeded + " gallons of paint");//Print the length, width, and height of the room and the
        //number of gallons of paint needed.
    }
}