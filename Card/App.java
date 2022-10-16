package Card;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Tom");
		Player player2 = new Player("Steve");
		
		deck.shuffle();
		System.out.println("--------------------------------");
		System.out.println("Deck has been shuffled!");
		System.out.println("-------------------------------- \n");
		System.out.println("Time to draw!");
		System.out.println("_____________________\n");
		
		for(int i = 0; i < 26; i++) {
			System.out.print(player1.getName() + " draws ");
			player1.draw(deck);
			System.out.print(player2.getName() + " draws ");
			player2.draw(deck);
			System.out.println();
		}
		player1.describe();
		System.out.println();
		player2.describe();
		System.out.println();
		
		System.out.println("--------------------------------");
		System.out.println("It's flipping time!");
		System.out.println("-------------------------------- \n");
		
		for(int i = 0; i < 26; i++) {
			Card p1 = player1.flip();
			Card p2 = player2.flip();
			if(p1.getValue() > p2.getValue()) {
				player1.incrementScore();
			}else if(p2.getValue() > p1.getValue()) {
				player2.incrementScore();
			}
			System.out.println(player1.getName() + " plays " + p1.getValue() + p1.getName());
			System.out.println(player2.getName() + " plays " + p2.getValue() + p2.getName());
			System.out.print(player1.getName() + ": " + player1.getScore() + " | ");
			System.out.println(player2.getName() + ": " + player2.getScore() + "\n");
		}
		
		System.out.println("FINISH! \n\n FINAL SCORE: ");
		System.out.println(player1.getName() + ": " + player1.getScore() + " points");
		System.out.println(player2.getName() + ": " + player2.getScore() + " points");
		System.out.println();
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins!");
		}else if(player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " wins!");
		}else {
			System.out.println("It's a... draw?!");
		}

	}

}
