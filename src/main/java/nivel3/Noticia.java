package nivel3;

public abstract class Noticia {
    private String titular;
    private String text;
    private int puntuacio;
    private Double preu;


    // Constructor
    public Noticia(String titular) {
        this.titular = titular;
        this.text = "";
            }

    // Getters and Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
            }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public double getPreu() {
        return preu;
    }

    public double setPreu(double preu) {
        this.preu = preu;
        return preu;
    }
    // Mètodes abstractes que les classes filles estan obligades a implementar
    public abstract double calcularPreuNoticia();
    public abstract int calcularPuntuacio();
}
