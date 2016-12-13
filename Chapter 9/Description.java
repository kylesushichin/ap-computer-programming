public class Description extends RoomNumber
{
    public Description(String subject)
    {
        super(subject);
    }
    public void getDescript()
    {
        super.getRoom();
        System.out.println("Here is a description of " + subject + "! " + subject + " is hard.");
    }
}