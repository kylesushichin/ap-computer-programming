public class Queens 
{
	private static int board[][] = 
	                       			{{0,0,0,0,0,0,0,0},
                        			{0,0,0,0,0,0,0,0},
                        			{0,0,0,0,0,0,0,0},
                        			{0,0,0,0,0,0,0,0},
                        			{0,0,0,0,0,0,0,0},
                        			{0,0,0,0,0,0,0,0},
                        			{0,0,0,0,0,0,0,0},
                        			{0,0,0,0,0,0,0,0}};
	public static void main(String args[])
	{
		queen(0);
		prntBoard();
	}
	public static boolean queen(int n)
	{
		for(int y = 0; y < board.length; y++)
		{
			for(int x = 0; x < board[y].length; x++)
			{
				if(valid(y,x))
				{
					board[y][x] = 1;
					if(n >=7) return true;
					
					boolean found = queen(n+1);
					if(!found)
					{
						board[y][x] = 0;
					}
					else return true;
				}
			}
		}
		return false;
	}
	public static boolean valid(int y, int x)
	{
		if(y < 8 && x < 8 && y >=0 && x >= 0)
		{
			if(board[y][x] == 1) return false;
			for(int i = 0; i < 8; i++){
				if(board[y][i] == 1) return false;
				if(board[i][x] == 1) return false;
				if(y + 1 < 8 && x + 1 < 8 && board[y+1][x+1] == 1) return false;
				if(y - 1 >= 0 && x + 1 < 8 && board[y-1][x+1] == 1) return false;
				if(y + 1 < 8 && x - 1 >= 0 && board[y+1][x-1] == 1) return false;
				if(y - 1 >= 0 && x - 1 >= 0 && board[y-1][x-1] == 1) return false;
			}
		}
		else return false;
		return true;
	}
	public static void prntBoard()
	{
		for(int y = 0; y < 8; y++)
		{
			for(int x = 0; x < 8; x++)
			{
				if(board[y][x] == 1)
				{
					System.out.print("\u2655");
				}
				else if((y%2 + x%2)%2 == 0)
				{
					System.out.print("\u2B1C");
				}
				else System.out.print("\u2B1B");
			}
			System.out.println();
		}
	}
}