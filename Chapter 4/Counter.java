public class Counter
{
    private int counter;
    
    public Counter()
    {
        counter = 0;
    }
    public void Click()
    {
        int click = counter++;
    }
    public int getCount()
    {
        return counter;
    }
    public void reset()
    {
        counter = 0;
    }

    
}
