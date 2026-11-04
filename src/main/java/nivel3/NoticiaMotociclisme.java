package nivel3;

public class NoticiaMotociclisme extends Noticia {
    private String equip;

    public NoticiaMotociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    @Override
    public double calcularPreuNoticia() {
        double preu = 100; // Preu base
        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            preu += 50;
        }
        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 3; // Punts base
        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            puntuacio += 3;
        }
        return puntuacio;
    }
}