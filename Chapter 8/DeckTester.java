public class DeckTester
{
    public static void main(String args[])
    {
        //private Player player1 = new player();
       // private Player player2 = new player();
        Deck deck = new Deck();
        //int[] a = new int[52];
        int[] p1;
        int[] p2;
        
        int[] variableDeck = deck.deck();
        
        deck.shuffle();
        deck.deal();
        //deck.p1();
        //deck.p2();
        p1 = deck.getP1();
        p2 = deck.getP2();
        
        int counter = 1;
       /* for( int value = 0; value < p1.length; value++)
        {
            System.out.println("Player1 Test hand" + counter + " " + p1[value]); 
            counter++;
        }*/    
        
       // System.out.println();
        
        for( int value = 0; value < p2.length; value++)
        {
            System.out.println("Player2 Test hand" + counter + " " + p2[value]); 
            counter++;
        }     
        /*int card = 1;
        for(int count = 0; count < a.length; count++)
        {
            if(count>0&&count%4==0)
                card++;
            a[count] = card;
        }
        for (int j = 0; j < a.length; j++)
            System.out.print(a[j]);
            
        System.out.print("\n");
        
        a = deck.shuffle(a);
        for (int i = 0; i < a.length; i++)
        {
            if(a[i]%2 != 0)
                player1.addCard(a);
            else 
                player2.addCard();
        }  */
        
        
        
    }
}