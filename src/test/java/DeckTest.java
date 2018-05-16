import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void checkDeckQuantity(){
        assertEquals(52, deck.deckQuantity());
    }

    @Test
    public void canDealCard(){
        assertEquals(Card.class, deck.dealCard().getClass());
        assertEquals(51, deck.deckQuantity());
    }


}
