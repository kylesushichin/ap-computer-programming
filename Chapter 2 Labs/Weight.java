import java.util.Scanner;
public class Weight 
{
	public static void main(String[]args) 
	{
		Scanner input = new Scanner(System.in);
		final int maleStart = 106, fmaleStart = 100;
		int ft, inch, height;
		System.out.print("Please insert your height in feet and inches: ");
		ft = input.nextInt();
		inch = input.nextInt();
		height = ft*12 + inch;
		//double mWeight = (height - maleStart) % 5; wrong
		//double fWeight = (height - fmaleStart) % 5; wrong
		double baseWeight = (height - 60);
		int goalM = ((int)baseWeight * 6) + maleStart;
		int goalF = ((int)baseWeight * 6) + fmaleStart;
		System.out.println("The ideal weight for a male that's " + ft + " feet\n" + 
		"and " + inch + " inches is " + goalM + "lbs.");
		System.out.println("The ideal weight for a female that's " + ft + " feet\n" + 
		"and " + inch + " inches is " + goalF + "lbs.");
		//add in 15% error margin
		
		System.out.println("");
		
		double mGoalM15, mGoalP15, fGoalM15, fGoalP15;
		mGoalM15 = goalM - (goalM * .15);
		mGoalP15 = goalM + (goalM * .15);
		fGoalM15 = goalF - (goalF * .15);
		fGoalP15 = goalF + (goalF * .15);
		
		System.out.println("The ideal weight for a male that's " + ft + " feet\n" + 
		"and " + inch + " inches is between " + mGoalM15 + "lbs and " + mGoalP15 + "lbs.");
		System.out.println("The ideal weight for a male that's " + ft + " feet\n" + 
		"and " + inch + " inches is between " + fGoalM15 + "lbs and " + fGoalP15 + "lbs.");
	}
}