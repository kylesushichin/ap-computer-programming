public class AhhhAliens 
{
	public static void main (String args[])
	{
		blurb();
	}
	public static void blurb()
	{
		String o = "";
		for(int p = 0; p < (int)(Math.random()*3)+2; p++)
		{
			o = o + wha();
		}
		String B = who() + o;
		if(B.length() >=50) System.out.print(B);
		
	}
	public static String who(){
		String Y = "";
		for(int p = 0; p < ((int)Math.random()+5); p++)
		{
			Y = Y + "y";
		}
		String i;
		i = "x" + Y;
		return i;
	}
	public static String wha()
	{
		String i = who();
		String u;
		String h;
		String l = "";
		if((int)Math.random()+1 == 1){
			h = "z";
		}else h = "d";
		for(int p = 0; p < (int)Math.random()+5; p++)
		{
			l = l + i;
		}
		u = "q" + h + l;
		return u;
	}
}`````````