import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    public Player player;
    public Card card2;

    @Before
    public void setup() {
        Card card1 = new Card(SuitType.DIAMONS, RankType.SIX);
        card2 = new Card(SuitType.CLUBS, RankType.THREE);
        player = new Player("Daniel", card1);
    }

    @Test
    public void canGetScore() {
        assertEquals(6, player.getScore());
    }

    @Test
    public void canGetName() {
        assertEquals("Daniel", player.getName());
    }

    @Test
    public void canSetCard(){
        player.setCard(card2);
        assertEquals(3, player.getScore());
    }
}
