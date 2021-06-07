/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Megha Patel
 * @modifier Sarim Iqbal
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
import java.util.Arrays; 
import java.util.Random; 


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Scanner uInput = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            
            c.setValue(randomNumber(1,13));
            
            //Random number between 0-3 here])
            
            c.setSuit(Card.SUITS[randomNumber(0,3)]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("\t========================================");
        System.out.println("\tWelcome to Card Trick!");
        System.out.println("\t========================================");

        System.out.print("\n\tPick a card, any card:  ");
        int uChoice = uInput.nextInt();

        System.out.print("\n\tPick your suit (Hearts, Spades etc.): ");
        String uChoice2 = uInput.nextLine();
        
        Card uCard = new Card(); 
        uCard.setValue(uChoice);
        uCard.setSuit(uChoice2); 
        
        Card luckyCard = new Card(); 
        luckyCard.setValue(6);
        luckyCard.setSuit("Spades"); 
        
        // MagicHand Search 
        
        int cardMatch = 0; 
        
        for(Card card : magicHand)
        {

            if(luckyCard.getValue() == card.getValue() && luckyCard.getSuit().
                    equalsIgnoreCase(uChoice2)) 
            {
                System.out.println("\n\tYou Won!, your lucky card was found in the"
                        + " MagicHand"); 
                cardMatch++; 
                
                  //if(uSelection.equals(magicHand[7])){
            //System.out.print("\n\tYou picked a card from the deck!");
         
            } 

         }
        
        //Then report the result here
        if (cardMatch == 0) {
            System.out.println("You lost, No matched card");
        }
        
    }
     public static int randomNumber(int x, int y)
       {
          return (int)Math.floor(Math.random()*(y-x+1)+x);
       }
}