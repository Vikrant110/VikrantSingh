/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
         Card[] magicHand = new Card[7];
        Scanner ScanInput = new Scanner(System.in);
        
        System.out.println("The cards in the magic hand are: ");
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(1 + (int) Math.floor(Math.random()*13));
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random()*4)]);
            magicHand[i] = c;
            System.out.println(c);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter the value of card : ");
        int InputByUser = UserInput.nextInt();
        System.out.println("Enter the suite (Hearts , Diamonds ,Clubs , Spades ");
        String TypeOfSuit = UserInput.next();
        System.out.println("Card created by User : " + InputByUser+" "+TypeOfSuit );

        
       Boolean RequiredResult=true;
        for (int i = 0; i < magicHand.length; i++) {
            if (InputByUser == magicHand[i].getValue() && TypeOfSuit == (magicHand[i].getSuit())) {
                RequiredResult = false;
            }
        }
        if (RequiredResult) {
            System.out.println("Card  Matched");
        } else {
            System.out.println("Card did't matched");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
