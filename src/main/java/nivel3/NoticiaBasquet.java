package nivel3;

public class NoticiaBasquet extends Noticia{
    private String competicio;
    private String club;


    public NoticiaBasquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public double calcularPreuNoticia() {
        double preu = 250;
        if(competicio.equalsIgnoreCase("Eurolliga")) {
            preu += 75;
        }
        if(club.equalsIgnoreCase("Barça") ||
           club.equalsIgnoreCase("Madrid")) {
            preu += 75;
        }
        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 4;
        if(competicio.equalsIgnoreCase("Eurolliga")) {
            puntuacio += 3;
        } else if (competicio.equalsIgnoreCase("ACB")) {
            puntuacio += 2;
        }
        if(club.equalsIgnoreCase("Barça") ||
           club.equalsIgnoreCase("Madrid")) {
            puntuacio += 1;
        }
        return puntuacio;
    }
}
