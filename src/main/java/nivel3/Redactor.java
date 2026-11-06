package nivel3;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nom;
    private final String dni;
    private static int sou = 1500;
    private ArrayList<Noticia> llistaNoticies;


    // constructor
    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
        this.llistaNoticies = new ArrayList<>();
    }

    // Getters and Setters

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public static int getSou() {
        return sou;
    }
    public void setSou(int sou) {
        Redactor.sou = sou;
    }
    public ArrayList<Noticia> getNoticies() {
        return llistaNoticies;
    }
    public void afegirNoticia(Noticia noticia) {
        this.llistaNoticies.add(noticia);
    }
}
