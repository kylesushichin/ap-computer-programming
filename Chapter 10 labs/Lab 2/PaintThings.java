import java.text.DecimalFormat;

public class PaintThings
{
    public static void main (String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        Rectangle deck = new Rectangle(20.0, 35.0);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10.0, 30.0);
        
        double deckAmt, ballAmt, tankAmt;
        
        deckAmt = deck.area();
        ballAmt = bigBall.area();
        tankAmt = tank.area();
        DecimalFormat fmt = new DecimalFormat("0.#");
    
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck: " + fmt.format(deckAmt));
        System.out.println ("Big Ball: " + fmt.format(ballAmt));
        System.out.println ("Tank: " + fmt.format(tankAmt));
    }
}