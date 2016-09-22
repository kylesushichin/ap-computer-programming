// ***************************************************************
// LabGrade.java
// This program computes a student's lab grade from
// the grades on the three components of lab: the pre-lab
// assignment, the lab itself, and the post-lab assignment.
// ***************************************************************
import java.util.Scanner;
//Chapter 2: Data and Expressions 21
public class LabGrades
{
	public static void main (String[] args)
	{
		// Declare constants
		double inWeight = 0.6; // in-class weight is 60%
		double outWeight = 0.4; // out-of-class weight is 40%
		// Declare variables
		double preLabPts; //number of points earned on the pre-lab assignment
		double preLabMax; //maximum number of points possible for pre-lab
		double labPts; //number of poitns earned on the lab
		double labMax; //maximum number of points possible for lab
		double postLabPts; //number of points earned on the post-lab assignment
		double postLabMax; //maximum number of points possible for the post-lab
		double outClassAvg; //average on the out of class (pre and post) work
		double inClassAvg; //average on the in-class work
		double labGrade; //final lab grade
		Scanner scan = new Scanner(System.in);
		// Get the input
		System.out.println("\nWelcome to the Lab Grade Calculator\n");
		System.out.print("Enter the in-classs weight and out-of-calss weight(in decimal form): ");
		inWeight = scan.nextDouble();
		outWeight = scan.nextDouble();
		System.out.print("Enter the number of points you earned on the pre-lab: ");
		preLabPts = scan.nextInt();
		System.out.print("What was the maximum number of points you could have earned? ");
		preLabMax = scan.nextInt();
		System.out.print("Enter the number of points you earned on the lab: ");
		labPts = scan.nextInt();
		System.out.print("What was the maximum number of points for the lab? ");
		labMax = scan.nextInt();
		System.out.print("Enter the number of points you earned on the post-lab: ");
		postLabPts = scan.nextInt();
		System.out.print("What was the maximum number of points for the post-lab? ");
		postLabMax = scan.nextInt();
		System.out.println();
		// Calculate the average for the out of class work
		outClassAvg = (preLabPts + postLabPts) / (preLabMax + postLabMax)* 100;
		// Calculate the average for the in-class work
		inClassAvg = labPts / labMax * 100;
		// Calculate the weighted average taking 40% of the out-of-class average
		// plus 60% of the in-class
		labGrade = outWeight * outClassAvg + inWeight * inClassAvg;
		// Print the results
		System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
		System.out.println("Your average on in-class work is " + inClassAvg + "%");
		System.out.println("Your lab grade is " + labGrade + "%");
		System.out.println();
	}
}