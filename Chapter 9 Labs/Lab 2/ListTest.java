// ***************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some
// ints in it, and prints the list.
//
// ***************************************************************
public class ListTest
{
    public static void main(String[] args)
    {
        IntList myList = new IntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        System.out.println(myList);
        
        SortedIntList aList = new SortedIntList(10);
        aList.add(100);
        aList.add(50);
        aList.add(200);
        aList.add(25);
        System.out.println(aList);
    }
}