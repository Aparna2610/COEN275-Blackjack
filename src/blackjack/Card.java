package blackjack;


public class Card {
    private String imagePath;
    private int value;

    public Card(Character imagePath, int value) {
        this.imagePath = ".\\src\\cards\\"+value+imagePath+".gif";
        this.value = value;
    }

    public String getImagePath() {

        return imagePath;
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
		return "Card Path: " + getImagePath() + " Value: " + getValue();
    	
    }
}
