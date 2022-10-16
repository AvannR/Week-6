package Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<>();
	
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
	}
	
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	
	public void describe() {
		System.out.println(name + "'s current hand:");
		System.out.println("_____________________");
		for(Card card : hand) {
			System.out.println(card.getValue() + card.getName());
		}
	}
	
	public Card flip() {
		Card card = new Card();
		card = hand.get(0);
		hand.remove(0);
		
		return card;
	}
	
	public void draw(Deck deck) {
		Card card;
		card = deck.draw();
		System.out.println(card.getValue() + "" + card.getName());
		hand.add(card);
	}
	
	public void incrementScore() {
		score += 1;
	}

}
