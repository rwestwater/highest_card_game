import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;
    private Random rng;

    public Deck(){
        rng = new Random();
        cards = new ArrayList<>();
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card (suit, rank);
                cards.add(card);
            }
        }
    }

    public int deckQuantity() {
        return this.cards.size();
    }


    public Card dealCard() {
        int index = rng.nextInt(deckQuantity());
        return cards.remove(index);
    }
}
