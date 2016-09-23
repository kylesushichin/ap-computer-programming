import java.util.*;
public class UserName 
{
	public static void main (String args[]) 
	{
		String fName;
		String lName;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.print("Type in your first name: ");
		fName = scan.nextLine();
		System.out.print("Type in your last name: ");
		lName = scan.nextLine();
		
		char fLetter = fName.charAt(0);
		String fiveLetters = lName.substring(0, 5);
		//int a = generator.nextInt(89);
		System.out.println(fLetter + fiveLetters + (generator.nextInt(89) + 10));
	}
}
