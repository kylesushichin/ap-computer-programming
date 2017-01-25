import java.util.Scanner;
public class Recursive
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter a number to find its factorial");
        
        n = scan.nextInt();
        Recursive rec = new Recursive();
        System.out.print(rec.recursion(n));
    }
    
    public int recursion(int n)
    {
        int result;
        if(n == 1) result = 1;
        else if(n <= 0) System.out.println("Factorials don't work for negatives or 0");
        else result = n*recursion(n - 1);
        return result;
    }
}