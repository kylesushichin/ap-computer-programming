import java.util.*;
public class PP9
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        
        System.out.println("Enter a phrase or a something.");
        str = scan.nextLine();
        str = str.toLowerCase().replace(" ","");
        for(int start = 0; start < str.length(); start++)
        {
            switch(str.charAt(start))
            {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }
        int length = str.length();
        int total = a + e + i + o + u;
        System.out.println("a\te\ti\to\tu\tnonvowels");
		System.out.println(a + "\t" + e + "\t" + i + "\t" + o + "\t" + u + "\t" + (length - total));
    }
}