public class PalindromeRecursion
{
    String result;
    public PalindromeRecursion()
    {
        System.out.print("Test another palindrome (y/n)?");
        result = scan.nextLine();
    }
    public String recursion(int n, int a)
    {
        if(n < a) 
        {
            if(result.charAt(n) == result.charAt(a)) 
            {
            result = "yes";
             recursion(n+1, a-1);
            }
             else
             result = "no";
        }
        
        
        return result;
    }
}
