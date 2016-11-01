public class PP3
{
    public static void main(String args[])
    {
        final int MAXLINE = 12;
        
        
        for(int counter = 1; counter <= 12; counter++)
        {
            for(int i = 1; i<=12; i++)
            {
                System.out.print(counter * i + "\t");
                if( i % MAXLINE == 0)
                {
                    System.out.println();
                }
            }
        }
    }
}