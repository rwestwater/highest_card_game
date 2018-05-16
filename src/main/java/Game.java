import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player1) {
        players.add(player1);
    }

    public int playerCount() {
        return players.size();
    }


}
