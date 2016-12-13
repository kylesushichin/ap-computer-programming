import java.util.*;
public class Deck
{
    Random gen = new Random();
     Player player1 = new Player();
     Player player2 = new Player();
    
    int[] a = new int[52];
    int[]shuffle;
    int cardNumber;//which card
    int randomElement;
    
    public int[] deck()
    {
        int card = 1;
        for(int count = 0; count < a.length; count++)
        {
            if(count>0&&count%4==0)
                card++;
            a[count] = card;
        }
        for(int i = 0; i < a.length; i++)
            System.out.println("Deck a " + a[i]);//print a
        return a;
    }
    
    public void deal()
    {
        
        
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] <= 26)
                player1.addCard(i,a[i]);
            else if(a[i] >= 26)
                player2.addCard(i,a[i]);
            /*if(a[i]%2 != 0)
                player1.addCard(i,a[i]);
            else 
                player2.addCard(i,a[i]);
            //System.out.print(player2.getHand()[i]);
        */
        }
       // for(int i = 0; i < player1.getHand().length; i++)
            //System.out.print(player1.gethand()[i]);//print p1 and p2
    }   
    
    public int[] getP1()
    {
        return player1.getHand();
    }
       
    public int[] getP2()
    {
        return player2.getHand();
    }   
        
    public void shuffle()
    {
        shuffle = new int[a.length];
        for(int cardCount = 0; cardCount < a.length; cardCount++)
        {
            cardNumber = gen.nextInt(a.length);//randomIndex
            randomElement = a[cardNumber];
            a[cardNumber] = a[cardCount];
            a[cardCount] = randomElement;
        }
        for(int i = 0; i < a.length; i++)
            System.out.println("Shuffle deck " + a[i]);//print a
    }
    
    
    /*public void p1()
    {
        for(int x = 0; x < player1.getHand().length; x++)
        {
            System.out.print(player1.getHand()[x] + " ");
        }
    }
    
    public void p2()
    {
        for(int y = 0; y < player2.getHand().length; y++)
        {
            System.out.print(player2.getHand()[y] + " ");
        }
    }*/
}