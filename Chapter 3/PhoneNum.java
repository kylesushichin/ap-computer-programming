import java.util.*;
public class PhoneNum 
{
	public static void main (String[]args) 
	{
		int num1,num2,num3,sec2,sec3;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		num1 = generator.nextInt(8);
		num2 = generator.nextInt(8);
		num3 = generator.nextInt(8);
		// cannot be 8 or 9
		
		sec2 = generator.nextInt(344)+655;
		//System.out.print(sec2);// just to check value is > 655
		// must be greater than 655
		
		sec3 = generator.nextInt(9999);
		
		System.out.println("Your new phone number is " + num1 + num2 + num3 +
				"-" + sec2 + "-" + sec3);
	}
}
