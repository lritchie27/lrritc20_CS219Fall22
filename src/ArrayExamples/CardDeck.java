package ArrayExamples;

import java.util.Arrays;

public class CardDeck {

    public static String [] build_deck() {
        String [] suits = {"♠", "❤", "♦", "♣"};
        String [] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String [] deck = new String[suits.length * ranks.length];

        int cnt = 0;

        for (String suit : suits) {   // for each suit in the suits array
            for (String rank: ranks) {
                deck[cnt++] = rank + suit;
            }
        }
        return deck;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(build_deck()));
    }

}
