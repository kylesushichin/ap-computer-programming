public class Driver 
{
	public static void main (String args[])
	{
		Comparable []list = {"*","**","***","****","*****"};
		for(Comparable j : list)
		{
			System.out.println(j);
		}
		System.out.println();
		System.out.println("Selection");
		
		Sorting sort = new Sorting();
		sort.selectionSort(list);
		System.out.println();
		
		System.out.println("Insertion");
		sort.insertionSort(list);
	}
}