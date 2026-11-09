package nivel3;

public class F1News extends News {
    private String teamF1;

    public F1News(String titular, String teamF1) {
        super(titular);
        this.teamF1 = teamF1;
        this.setPunctuation(calculateNewsPunctuation());
        this.setPrice(calculateNewsPrice());
    }

    @Override
    public double calculateNewsPrice() {
        double price = 100; // Preu base
        if (teamF1.equalsIgnoreCase("Ferrari") ||
            teamF1.equalsIgnoreCase("Mercedes")) {
            price += 50;
        }
        return price;
    }

    @Override
    public int calculateNewsPunctuation() {
        int punctuation = 4; // Punts base
        if (teamF1.equalsIgnoreCase("Ferrari") ||
            teamF1.equalsIgnoreCase("Mercedes")) {
            punctuation += 2;
        }
        return punctuation;
    }
}