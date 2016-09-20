import java.util.Scanner;
public class Info
{
    public static void main(String args[])
    {
        String name;
        String College;
        String petname;
        float age; 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.print("Enter your pet's name: ");
        petname = scan.nextLine();
        System.out.print("Enter your college: ");
        College = scan.nextLine();
        //had to put the float at the end because it messed up the strings
        System.out.print("Enter your age: ");
        age = scan.nextFloat();
        
        System.out.println("");
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I'm enjoying my time at " + College + ", though I miss my pet " + petname + " very much!");
    
    
    //String title = new String("Java Software Solutions");
    //title = "Java ....";
    }
}