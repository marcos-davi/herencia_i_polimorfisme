package nivel3;

public abstract class News {
    private String title;
    private String text;
    private int punctuation;
    private Double price;

    public News(String title) {
        this.title = title;
        this.text = "";
        this.punctuation = 0;
        this.price = 0.0;
    }



    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
            }

    public void setText(String text) {
        this.text = text;
    }

    public int getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(int punctuation) {

        this.punctuation = punctuation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateNewsPrice();
    public abstract int calculateNewsPunctuation();
}
