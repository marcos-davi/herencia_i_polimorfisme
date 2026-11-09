package nivel3;

public class TennisNews extends News {
    private String competition;
    private String tennisPlayer;

    public TennisNews(String titular, String competition, String tennisPlayer) {
        super(titular);
        this.competition = competition;
        this.tennisPlayer = tennisPlayer;
        this.setPunctuation(calculateNewsPunctuation());
        this.setPrice(calculateNewsPrice());
    }

    @Override
    public double calculateNewsPrice() {
        double price = 150; // Preu base
        if (tennisPlayer.equalsIgnoreCase("Federer") ||
                tennisPlayer.equalsIgnoreCase("Nadal") ||
                tennisPlayer.equalsIgnoreCase("Djokovic")) {
            price += 100;
        }
        return price;
    }

    @Override
    public int calculateNewsPunctuation() {
        int punctuation = 4;
        if (tennisPlayer.equalsIgnoreCase("Federer") ||
                tennisPlayer.equalsIgnoreCase("Nadal") ||
                tennisPlayer.equalsIgnoreCase("Djokovic")) {
            punctuation += 3;
        }
        return punctuation;
    }
}