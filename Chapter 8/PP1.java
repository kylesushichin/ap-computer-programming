import java.util.Scanner;
public class PP1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number between 0-50: ");
        int a = scan.nextInt();
        
        int[] occurances = new int[51];
        
        while(a >= 0  && a <= 50)
        {
            
            occurances[a]++;

                
            System.out.print("\nEnter a number between 0-50: ");
            a = scan.nextInt();
        }
        for (int i = 0; i < occurances.length; i++)
        {
            System.out.print(i);
            System.out.println(": " + occurances[i]);
        }
    }
}