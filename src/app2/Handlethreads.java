package app2;

import java.util.Random;

public class Handlethreads implements Runnable {
    
    @Override
    public void run(){
        // Program a deck of cards to shuffle

        // To get a list of cards to shuffle
        Random rand = new Random();
        // Deck of cards has 53 cards to shuffle
        int deckofCards = 52;
        int random = rand.nextInt(deckofCards);
        DeckofCards deck = new DeckofCards();
        deck.setType();


        System.out.printf("The card that i get is %s and the number is %d\n", deck.getType() ,random);
    }
}
