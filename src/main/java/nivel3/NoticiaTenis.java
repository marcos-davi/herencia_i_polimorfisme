package nivel3;

public class NoticiaTenis extends Noticia {
    private String competicio;
    private String tenistes;

    public NoticiaTenis(String titular, String competicio, String tenistes) {
        super(titular);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    @Override
    public double calcularPreuNoticia() {
        double preu = 150; // Preu base
        if (tenistes.equalsIgnoreCase("Federer") ||
                tenistes.equalsIgnoreCase("Nadal") ||
                tenistes.equalsIgnoreCase("Djokovic")) {
            preu += 100;
        }
        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 4; // Punts base
        if (tenistes.equalsIgnoreCase("Federer") ||
                tenistes.equalsIgnoreCase("Nadal") ||
                tenistes.equalsIgnoreCase("Djokovic")) {
            puntuacio += 3;
        }
        return puntuacio;
    }
}