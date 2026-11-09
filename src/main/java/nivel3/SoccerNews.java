package nivel3;

public class SoccerNews extends News {

   private String competition;
   private String club;
   private String player;

    public SoccerNews(String title, String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
        this.setPunctuation(calculateNewsPunctuation());
        this.setPrice(calculateNewsPrice());
    }

    @Override
    public double calculateNewsPrice() {
        double price = 300;
        if(competition.equalsIgnoreCase("Lliga de Campions")) {
            price += 100;
        }
        if(club.equalsIgnoreCase("Barça") ||
           club.equalsIgnoreCase("Madrid")) {
            price += 100;
        }
        if(player.equalsIgnoreCase("Ferran Torres") ||
           player.equalsIgnoreCase("Benzema")) {
            price += 50;
        }
        return price;
    }

    @Override
    public int calculateNewsPunctuation() {
        int punctuation = 5;
        if(competition.equalsIgnoreCase("Lliga de Campions")) {
            punctuation += 3;
        } else if (competition.equalsIgnoreCase("Lliga")) {
            punctuation += 2;
        }

        if(club.equalsIgnoreCase("Barça") ||
           club.equalsIgnoreCase("Madrid")) {
            punctuation += 1;
        }
        if(player.equalsIgnoreCase("Ferran Torres") ||
           player.equalsIgnoreCase("Benzema")) {
            punctuation += 1;
        }
        return punctuation;
    }
}
