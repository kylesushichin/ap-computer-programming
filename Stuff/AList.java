import java.util.*;

public class AList{
    public static void main(String PleaseGiveRushabhASixty[]){
        ArrayList<Character> list = new ArrayList<Character>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Sentence: ");
        String Sentence = input.nextLine();
        for(int i = Sentence.length(); i>0; i--){
            list.add(Sentence.charAt(i));
        }
        for(int i = Sentence.length(); i>0; i--){
            System.out.println(list.get(i));
        }
    }
}