public class Countertest
{
    public static void main(String args[])
    {
        Counter counter1, counter2;
        
        counter1 = new Counter();
        counter2 = new Counter();
        
        counter1.getCount();
        counter2.getCount();
        
        counter1.Click();
        counter1.Click();
        counter1.getCount();
        System.out.println("Counter number: " + counter1.getCount());
        
        counter2.Click();
        counter2.getCount();
        System.out.println("Counter number2: " + counter2.getCount());
    }
}