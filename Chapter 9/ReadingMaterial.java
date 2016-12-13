import java.util.*; //pp3
public class ReadingMaterial
{
    public static void main(String args[])
    {
        Random gen = new Random();
        
        Pages a = new Pages(gen.nextInt(999)+1);
        Books b = new Books(gen.nextInt(999)+1);
        Novels c = new Novels(gen.nextInt(999)+1);
        Journal d = new Journal(gen.nextInt(999)+1);
        Textbooks e = new Textbooks(gen.nextInt(500)+500);
        
        //a.setPages();
        b.setPages();
        c.setPages();
        d.setPages();
        e.setPages();
    }
}