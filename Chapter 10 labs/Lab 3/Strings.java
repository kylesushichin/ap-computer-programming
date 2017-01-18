import java.util.Scanner;

public class Strings
{
    public static void main (String[] args)
    {
        String[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nHow many words do you want to sort? ");
        size = scan.nextInt();
        intList = new String[size];
        
        System.out.println ("\nEnter the words  ...");
        
        for (int i = 0; i < size; i++)
            intList[i] = scan.next();
        
        Sorting.insertionSort(intList) ;
        System.out.println ("\nYour words in sorted order...");
        
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");

        System.out.println ();
    }
}