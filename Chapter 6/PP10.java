public class PP10
{
    public static void main(String args[])
    {      
        for(int i = 1; i <= 12; i++)
        {
		    System.out.println("On the " + i + "th day of Christmas, my true love gave to me");
			switch(i)
			{
    			case 12:
    				System.out.println("Twelve drummers drumming,");
    			case 11:
    				System.out.println("Eleven pipers piping,");
    			case 10:
    				System.out.println("Ten lords a leaping,");
    			case 9:
    				System.out.println("Nine ladies dancing,");
    			case 8:
    				System.out.println("Eight maids a milking,");
    			case 7:
    				System.out.println("Seven swans a swimming,");
    			case 6:
    				System.out.println("Six geese a laying,");
    			case 5:
    				System.out.println("Five golden rings,");
    			case 4:
    				System.out.println("Four calling birds,");
    			case 3:
    				System.out.println("Three French hens,");
    			case 2:
    				System.out.println("Two turtle doves, and");
    			case 1:
    				System.out.println("A Partridge in a pear tree.");
    			}
		}
    }
}