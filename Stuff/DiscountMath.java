import java.util.Scanner;
public class DiscountMath
{
    private double stupid;
    private int bleh;
    Scanner scan = new Scanner(System.in);
    private double sigh;
    
    public DiscountMath()
    {
        stupid = 0;
        sigh = 0;
    }
    public double ugh()
    {
        System.out.println("Enter a number");;
        stupid = scan.nextDouble();
        if(stupid<0)
        {
            new stupid = (stupid * -1);
            return stupid;
        }
        else
        {
            return stupid;
        }
    }
    public int ThanksForThePencil()
    {
        System.out.println("enter a number");
        sigh = Scan.nextDouble();
        System.out.println("enter an exponent");
        bleh = scan.nextInt();
        int pinkie;
        
        if(bleh > 0)
        {
            while(0<bleh)
            {
                pinkie = pinkie * sigh;
                bleh--;
            }
            return pinkie;
        }
        else if(bleh==0)
        {
            sigh = 1;
            return sigh;
        }
        else if(bleh<0)
        {
            while(0>bleh)
            {
                pinkie = 1 / (pinkie*sigh);
                bleh++
            }
            return pinkie;
        }
        
    }
}