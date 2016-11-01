public class PP8
{
    public static void main(String args[])
    {
        Spacer space = new Spacer();
		int counter = 0;
		for(int i = 32; i<=126; i++)
		{
			space.space(counter);
			System.out.print(i + " " + (char)i + "\t");
			counter++;
		}
    }
}