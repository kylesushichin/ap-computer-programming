public class SortedIntList extends IntList
{
    private int size;
    public SortedIntList(int size)
    {
        super(size);
        this.size = size;
    }
    public void add(int thing)
    {
        int greater = 0;
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else if( numElements == 0)
        {
            list[0] = thing;
            numElements++;
        }
        else
        {
            for(int check = 0; check < numElements; check++)
            {
                if(list[check] < thing)
                    greater++;
                
            }
            for(int shift = numElements; shift >= greater; shift--)
            {
                int x = list[shift];
                list[shift + 1] = x;
            }
            list[greater] = thing;
            numElements++;
        }
    }
}