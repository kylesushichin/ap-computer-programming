import java.util.Scanner;
public class Thing
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        String answer1;
        String answer2;
        
        
        System.out.print("Type some words in: ");
        answer1 = scan.next(); 
        
        System.out.println("Look I can make it do things like....." + answer1);
        System.out.println("\nSo I'm gonna try to do a thing");
        System.out.println("\nChoose a number between 1-3 but type the word... because I suck at things.");
        answer2 = scan.next();
        
        if(answer2.equals("one"))
        {
            System.out.println("\nPick either a story or a question ");
        }
        if(answer2.equals("One"))
        {
            System.out.println("\nPick Story");
        }
        
    }
}
/*import java.util.*;

public class secretSort{
    public static void main(String args[]){
        Scanner nyet = new Scanner(System.in);
        System.out.print("Enter Text To Sort: ");
        String s1 = nyet.nextLine();
        System.out.println("abcdefghijklmnopqrstuvwxyz");
        System.out.print("Enter Text To Sort: ");
        s1 = nyet.nextLine();
        System.out.println("Abby, Prom?");
    }
}
*/