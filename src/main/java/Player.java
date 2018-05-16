public class Player {

    private String name;
    private Card card;

    public Player(String name, Card card){
        this.name = name;
        this.card = card;
    }

    public int getScore(){
        return this.card.getRankType().getValue();
    }

    public String getName(){
        return name;
    }

    public void setCard(Card card){
        this.card = card;
    }
}
