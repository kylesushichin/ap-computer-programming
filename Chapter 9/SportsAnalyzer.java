import java.util.*;
public class SportsAnalyzer
{
    public static void main(String args[])
    {
        Random gen = new Random();
        int rando = gen.nextInt(50)+15;
        
        Player a = new Player(gen.nextInt(99)+1);
        Yards b = new Yards(rando);
        Catches c = new Catches(rando);
        Fumble d = new Fumble(rando);
        
        //a.getStats();
        b.getStats();
        c.getStats();
        d.getStats();
    }
}