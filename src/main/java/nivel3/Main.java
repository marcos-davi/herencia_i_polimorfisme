package nivel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        List<Redactor> redactors = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcio;
        Boolean sortir = false;
        do {
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

    private static void calcularPreuNoticia() {
    }

    private static void calcularPuntuacioNoticia() {
    }

    private static void mostrarNoticiesRedactor() {
    }

    private static void eliminarNoticia() {
    }

    private static void introduirNoticiaRedactor() {
    }

    private static void eliminarRedactor() {
    }

    private static void introduirRedactor() {
    }

}

