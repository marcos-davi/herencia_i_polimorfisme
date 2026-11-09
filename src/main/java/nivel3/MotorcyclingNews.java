package nivel3;

public class MotorcyclingNews extends News {
    private String teamMoto;

    public MotorcyclingNews(String title, String teamMoto) {
        super(title);
        this.teamMoto = teamMoto;
        this.setPunctuation(calculateNewsPunctuation());
        this.setPrice(calculateNewsPrice());
    }

    @Override
    public double calculateNewsPrice() {
        double price = 100;
        if (teamMoto.equalsIgnoreCase("Honda") || teamMoto.equalsIgnoreCase("Yamaha")) {
            price += 50;
        }
        return price;
    }

    @Override
    public int calculateNewsPunctuation() {
        int punctuation = 3;
        if (teamMoto.equalsIgnoreCase("Honda") || teamMoto.equalsIgnoreCase("Yamaha")) {
            punctuation += 3;
        }
        return punctuation;
    }
}