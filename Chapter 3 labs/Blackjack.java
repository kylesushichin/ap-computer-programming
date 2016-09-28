public class Blackjack
{
    enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}
    public static void main(String args[])
    {
        Rank highCard, faceCard, card1, card2; 
        
        int sum;
        
        highCard = Rank.ace;
        faceCard = Rank.jack;
        card1 = Rank.ten;
        card2 = Rank.three;
        
        int cardVal1 = card1.ordinal()+1;
        int cardVal2 = card2.ordinal()+1;
        
        sum = cardVal1 + cardVal2;
        
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        System.out.println("The first card is: " + card1 + " The Second card is: " + card2);
        System.out.println("Hand Value: " + sum);
    }
}