import java.text.NumberFormat;

public class DVDCollection
{
	private DVD[] collection;
	private int count;
	private double totalCost;

	public DVDCollection ()
	{
		collection = new DVD[100];
		count = 0;
		totalCost = 0.0;
	}

	public void addDVD (String title, String director, int year, double cost, boolean bluRay)
	{
		if (count == collection.length)
			increaseSize();

		DVD temp = new DVD (title, director, year, cost, bluRay);
		if(count == 0)
			collection[0] = temp;
		else
		{
			sort(temp);
		}
		totalCost += cost;
		count++;

	}

	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "My DVD Collection\n\n";

		report += "Number of DVDs: " + count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "Average cost: " + fmt.format(totalCost/count);

		report += "\n\nDVD List:\n\n";

		for (int dvd = 0; dvd < count; dvd++)
			report += collection[dvd].toString() + "\n";

		return report;
	}

	private void increaseSize ()
	{
		DVD[] temp = new DVD[collection.length * 2];

		for (int dvd = 0; dvd < collection.length; dvd++)
			temp[dvd] = collection[dvd];

		collection = temp;
	}
	public void sort(DVD obj)
	{
		int counting = 0;
		DVD temp; 
		for(int i = 0; i < count; i++)
		{
			if (obj.getTitle().compareTo(collection[i].getTitle()) > 0)
				counting++;
		}

		for(int j = count; j > counting; j--)
		{
			collection[j] = collection[j - 1];
		}
		collection[counting] = obj;
	}
}
