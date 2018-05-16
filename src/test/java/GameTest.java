import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;

    @Before
    public void before() {
        game = new Game(new Deck());
        player1 = new Player("Daniel", new Card(SuitType.DIAMONS, RankType.SIX));
        player2 = new Player("Rachel", new Card(SuitType.CLUBS, RankType.KING));
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());
    }


}
