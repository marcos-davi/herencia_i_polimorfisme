package nivel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Redactor> redactors = new ArrayList<Redactor>();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcio;
        boolean sortir = false;
        do {
            System.out.println("----------Introdueix el una opcio del menu: ----------");
            System.out.println("Selecciona una opció: ");
            System.out.println("--- GESTIÓ DE REDACCIÓ DE NOTÍCIES ---");
            System.out.println("1. Introduir redactor");
            System.out.println("2. Eliminar redactor");
            System.out.println("3. Introduir notícia a un redactor");
            System.out.println("4. Eliminar notícia");
            System.out.println("5. Mostrar totes les notícies d’un redactor");
            System.out.println("6. Calcular puntuació d’una notícia");
            System.out.println("7. Calcular preu d’una notícia");
            System.out.println("0. Sortir");

            opcio = entrada.nextInt();
            entrada.nextLine();
            switch (opcio) {
                case 1:
                    introduirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introduirNoticiaRedactor();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticiesRedactor();
                    break;
                case 6:
                    calcularPuntuacioNoticia();
                    break;
                case 7:
                    calcularPreuNoticia();
                    break;
                case 0:
                    System.out.println("Gràcies per utilitzar l'aplicació. Fins aviat!");
                    sortir = true;
                    break;
            }
        }while (!sortir);
    }

    private static void introduirRedactor() {

        System.out.println("Introdueix el nom del redactor: ");
        String nom = entrada.nextLine();
        System.out.println("Introdueix el DNI del redactor: ");
        String dni = entrada.nextLine();

        if (buscarRedactorPerDni(dni) != null) {
            System.out.println("Error: Ja existeix un redactor amb aquest DNI.");
        } else {
            Redactor redactor = new Redactor(nom, dni);
            redactors.add(redactor);
            System.out.println("Redactor afegit correctament.");
        }

    }

    private static void eliminarRedactor() {

    }

    private static void introduirNoticiaRedactor() {

    }

    private static void eliminarNoticia() {
        //(cal demanar el redactor i el titular de la notícia)

    }

    private static void mostrarNoticiesRedactor() {
    }

    private static void calcularPuntuacioNoticia() {

    }

    private static void calcularPreuNoticia() {

    }


    private static Redactor buscarRedactorPerDni(String dni) {
        for (Redactor r : redactors) {
            if (r.getDni().equalsIgnoreCase(dni)) {
                return r;
            }
        }
        return null;
    }

}

