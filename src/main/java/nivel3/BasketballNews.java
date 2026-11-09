package nivel3;

public class BasketballNews extends News {
    private String competition;
    private String club;


    public BasketballNews(String titular, String competition, String club) {
        super(titular);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public double calculateNewsPrice() {
        double price = 250;
        if(competition.equalsIgnoreCase("Eurolliga")) {
            price += 75;
        }
        if(club.equalsIgnoreCase("Barça") ||
           club.equalsIgnoreCase("Madrid")) {
            price += 75;
        }
        return price;
    }

    @Override
    public int calculateNewsPunctuation() {
        int punctuation = 4;
        if(competition.equalsIgnoreCase("Eurolliga")) {
            punctuation += 3;
        } else if (competition.equalsIgnoreCase("ACB")) {
            punctuation += 2;
        }
        if(club.equalsIgnoreCase("Barça") ||
           club.equalsIgnoreCase("Madrid")) {
            punctuation += 1;
        }
        return punctuation;
    }
}
