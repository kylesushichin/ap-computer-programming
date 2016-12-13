import java.util.Random;
public class Electronics
{
    Random gen = new Random();
    String device;
    public Electronics(String device)
    {
        this.device = device;
    }
    public void getDevice()
    {
        System.out.println(device);
        System.out.println("The " + device + " weighs " + (gen.nextInt(30)+1) + " pounds");
        System.out.println("The " + device + " costs " + (gen.nextInt(1500)+ 400) + " dollars");
        System.out.println("The " + device + "'s power usage " + (gen.nextInt(170)+80) + " watts");
        
    }
}