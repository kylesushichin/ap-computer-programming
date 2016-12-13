import java.util.Random;
public class RoomNumber extends Subject
{
    Random gen = new Random();
    public RoomNumber(String subject)
    {
        super(subject);
    }
    public void getRoom()
    {
        super.getSubject();
        System.out.println("Room " + (gen.nextInt(200)+50));
        System.out.println("Course #" + (gen.nextInt(200)+50));
    }
}