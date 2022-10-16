package Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<>();
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
	public int deckSize() {
		return cards.size();
	}
	
	public Deck() {
		cards = new ArrayList<Card>();
		for(int i = 2; i <= 14; i++) {
			Card heart = new Card();
			heart.setValue(i);
			heart.setName(" of Hearts");
			cards.add(heart);
			
			Card club = new Card();
			club.setValue(i);
			club.setName(" of Clubs");
			cards.add(club);
			
			Card diamond = new Card();
			diamond.setValue(i);
			diamond.setName(" of Diamonds");
			cards.add(diamond);
			
			Card spade = new Card();
			spade.setValue(i);
			spade.setName(" of Spades");
			cards.add(spade);
		}
	}

}
