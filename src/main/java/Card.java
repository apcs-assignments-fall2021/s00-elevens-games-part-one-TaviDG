// The Card class represents a single card in our card game
public class Card {

	// String value that holds the rank of the card
	private String rank;

	// String value that holds the suit of the card
	private String suit;

	// int value that holds the point value
	private int pointValue;

	// Constructor: Creates a new Card instance.
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}

	// Accesses this Card's rank.
	public String getRank() {
		// YOUR CODE HERE
		return rank;
	}

	// Accesses this Card's suit.
	public String getSuit() {
		// YOUR CODE HERE
		return suit;
	}

	// Accesses this Card's point value.
	public int getPointValue() {
		// YOUR CODE HERE
		return pointValue;
	}

	// Compare this card with another
	public boolean equals(Card other) {
		if (this.pointValue==other.getPointValue() && this.suit.equals(other.getSuit()) && this.rank.equals(other.getRank())){
			return true;
		}
		return false;
	}

	// Converts the rank, suit, and point value into a string in the format
	//     "[Rank] of [Suit] (point value = [PointValue])".
	//     e.g. "Queen of Spades (point value = 10);
	public String toString() {
		// YOUR CODE HERE
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}






	// CODE BELOW HERE IS ALREADY WRITTEN:
	// This version of equals is used in the testing code
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		else if (o == null || getClass() != o.getClass()) {
			return false;
		}
		else {
			return this.equals((Card) o);
		}
	}
}
