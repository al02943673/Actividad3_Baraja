package collection;

import java.util.*;




public class Deck {
	private static final int Tamaño = 52;

    public static void main(String args[]) {
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for (int i = 0; i < Tamaño; ++i) {
            deck.add(i);
        }

     Collections.shuffle(deck);

        Shuffle();
        head();
        pick();
        hand();
        
       System.out.println(deck);
    }

    static void Shuffle()  {
	
    	System.out.print("Se mezcló el Deck");
	
    	}
    
    
    static void head() {
    	
    	int r=Tamaño-1;
    	Card card =new Card(null, null, null);
    	System.out.print(card.getClass());
    	System.out.print("Quedan" + r +"de" +Tamaño);
    }

    static void pick() {
    	int r=Tamaño-2;
    	Card card =new Card(null, null, null);
    	System.out.print(card.getClass());;
    	System.out.print("Quedan" + r +"de" +Tamaño);
	
    }

    static void hand() {
    	
    	
    }

}