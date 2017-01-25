public class GCD_Algorithm
{
    public static int gcd(int num1, int num2)
    {
        int result;
        if(num2 % num1 == 0)
        {
            result = num1;
        }
        else if(num2 % num1 != 0)
        {
            gcd(num2, num1%num2)
        }
        return result;
    }
}