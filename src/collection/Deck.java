package collection;

import java.util.*;




public class Deck {
	private static final int Tama�o = 52;

    public static void main(String args[]) {
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for (int i = 0; i < Tama�o; ++i) {
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
	
    	System.out.print("Se mezcl� el Deck");
	
    	}
    
    
    static void head() {
    	
    	int r=Tama�o-1;
    	Card card =new Card(null, null, null);
    	System.out.print(card.getClass());
    	System.out.print("Quedan" + r +"de" +Tama�o);
    }

    static void pick() {
    	int r=Tama�o-2;
    	Card card =new Card(null, null, null);
    	System.out.print(card.getClass());;
    	System.out.print("Quedan" + r +"de" +Tama�o);
	
    }

    static void hand() {
    	
    	
    }

}