package nivel3;

public class NoticiaF1 extends Noticia {
    private String escuderia;

    public NoticiaF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    @Override
    public double calcularPreuNoticia() {
        double preu = 100; // Preu base
        if (escuderia.equalsIgnoreCase("Ferrari") ||
            escuderia.equalsIgnoreCase("Mercedes")) {
            preu += 50;
        }
        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 4; // Punts base
        if (escuderia.equalsIgnoreCase("Ferrari") ||
            escuderia.equalsIgnoreCase("Mercedes")) {
            puntuacio += 2;
        }
        return puntuacio;
    }
}