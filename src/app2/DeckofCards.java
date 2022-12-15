package app2;

import java.util.Random;

public class DeckofCards {
    private String type;
    private Integer number;
    private Integer value;

    public String getType() {
        return type;
    }
    public void setType() {
        String[] cards = {"clubs", "diamonds", "hearts", "spades"};
        Random random = new Random();
        Integer value = 3;
        Integer decks = random.nextInt(value);
        this.type = cards[decks];
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Integer getValue() {
        return value;
    }
    
}
