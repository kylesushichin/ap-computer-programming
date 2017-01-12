public class PhoneList
{
    public static void main(String args[])
    {
        Contact[] friends = new Contact[4];
        
        friends[0] = new Contact("john", "smith", "610-555-7654");
        friends[1] = new Contact("dad", "dy", "123-123-1234");
        friends[2] = new Contact("Smith", "joe", "610-543-9876");
        friends[3] = new Contact("purple", "howard", "098-876-6543");
        
        Sorting.selectionSort(friends);
        
        for(Contact friend : friends)
            System.out.println(friend);
    }
}