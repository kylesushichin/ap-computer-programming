// ***************************************************************
// StringManips.j ava
//
// Test several methods for manipulating String objects
// ***************************************************************
import java.util.Scanner;
public class StringManips
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String state;
        String city;
        
        System.out.print("Enter your state: ");
        state = scan.nextLine();
         System.out.print("Enter your city: ");
        city = scan.nextLine();
        
        state = state.toUpperCase();
        city = city.toLowerCase();
        
        String phrase = new String ("This is a String test.");
        int phraseLength; // number of characters in the phrase String
        int middleIndex; // index of the middle character in the String
        String firstHalf; // first half of the phrase String
        String secondHalf; // second half of the phrase String
        String switchedPhrase; //a new phrase with original halves switched
        String middle3;
        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        
        firstHalf = firstHalf.replaceAll(" ", "*");
        secondHalf = secondHalf.replaceAll(" ", "*");
        
        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        
        // print information about the phrase
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength + " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println();
        System.out.println("The middle3 characters are: " + middle3);
        System.out.println(state + city + state);
        
    }
}