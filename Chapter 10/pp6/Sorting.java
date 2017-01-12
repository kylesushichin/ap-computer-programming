public class Sorting
{
	public static void selectionSort (Comparable[] list)
	{
		int max;//=0
		Comparable temp;
		int count = 0;
		for (int index = 0; index < list.length; index++)
		{
			max = index;//first
			for (int scan = index+1; scan < list.length; scan++)//second
				if (list[scan].compareTo(list[max]) > 0)
					max = scan;

			// Swap the values
			temp = list[max];
			list[max] = list[index];
			list[index] = temp;
			
			System.out.print(list[count]);
			count++;
			
			System.out.println();
			
			for(int u = 10000000; u > 0; u--)
				System.out.print("");
		}
	}
	public static void insertionSort (Comparable[] list)
	{		
		for (int index = 1; index < list.length; index++)
		{
			Comparable key = list[index];
			int position = index;
			while (position > 0 && key.compareTo(list[position-1]) > 0)
			{
				list[position] = list[position-1];
				position--;
			}
			list[position] = key;
		}
		for(int count2 = 0; count2<list.length; count2++)
		{
			System.out.print(list[count2]);
			System.out.println();
			for(int u = 10000000; u > 0; u--)System.out.print("");
		}
	}
}