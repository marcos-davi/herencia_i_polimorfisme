package nivel1.exercise1;

public abstract class Instrument {
    private String name;
    private int price;

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void play();

}