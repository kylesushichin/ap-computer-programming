public class Test
{
    private int test1;
    
    public Test(int score1)
    {
        test1 = score1;
 
    }
    public String toString()
    {
        String result;
        
        result = "test score" + test1;
        return result;
    }
    public int setScore(int a)
    {
        a = 0;
        return a;
    }
    public int getTestScore()
    {
        return test1;
    }
}