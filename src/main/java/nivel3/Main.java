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

            if (entrada.hasNextInt()) {
                opcio = entrada.nextInt();
                entrada.nextLine();
            } else {
                System.out.println("Si us plau, introdueix un número vàlid.");
                entrada.nextLine();
                continue;
            }
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
        System.out.println("Introdueix el DNI del redactor que vol eliminar: ");
        String dni = entrada.nextLine();
        Redactor redactor = buscarRedactorPerDni(dni);

        if (buscarRedactorPerDni(dni) == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
        } else {

            redactors.remove(redactor);
            System.out.println("Redactor eliminat correctament.");
        }

    }

    private static void introduirNoticiaRedactor() {
        System.out.println("Introdueix el DNI del redactor que al vol introduir una noticia: ");
        String dni = entrada.nextLine();
        Redactor redactor = buscarRedactorPerDni(dni);
        Noticia novaNoticia = null;

        if (buscarRedactorPerDni(dni) == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
        } else {
            boolean sortir = false;
            int tipusEports = 0;

                System.out.println("\nRedactor: " + redactor.getNom() +" " + redactor.getDni());

                System.out.println("\nSelecciona el tipus de notícia:");
                System.out.println("1. Futbol");
                System.out.println("2. Bàsquet");
                System.out.println("3. Tenis");
                System.out.println("4. Fórmula 1");
                System.out.println("5. Motociclisme");
                System.out.print("Opció d'esport: ");


                if (entrada.hasNextInt()) {
                    tipusEports = entrada.nextInt();
                    entrada.nextLine();
                } else {
                    System.out.println("Si us plau, introdueix un número vàlid.");
                    entrada.nextLine();
                }
                System.out.println("Introdueix un titular");
                String titular = entrada.nextLine();


                switch (tipusEports) {
                    case 1:
                        System.out.println("Introdueix una competicio (ex: Lliga de Campions o Lliga): ");
                        String competFutebol = entrada.nextLine();
                        System.out.println("Introdueix un clubFutebol (ex: Barça, Madrid): ");
                        String clubFutebol = entrada.nextLine();
                        System.out.println("Introdueix un jugadorFutbol (ex: Ferran Torres o Benzema): ");
                        String jugadorFutbol = entrada.nextLine();
                        novaNoticia = new NoticiaFutbol(titular, competFutebol, clubFutebol, jugadorFutbol);
                        break;

                    case 2:
                        System.out.print("Introdueix la competició (ex: Eurolliga, ACB): ");
                        String compBasquet = entrada.nextLine();
                        System.out.print("Introdueix el club (ex: Barça, Madrid): ");
                        String clubBasquet = entrada.nextLine();
                        novaNoticia = new NoticiaBasquet(titular, compBasquet, clubBasquet);
                        break;

                    case 3:
                        System.out.print("Introdueix la competició: ");
                        String compTenis = entrada.nextLine();
                        System.out.print("Introdueix el tenista principal (ex: Nadal, Federer, Djokovic): ");
                        String tenista = entrada.nextLine();
                        novaNoticia = new NoticiaTenis(titular, compTenis, tenista);
                        break;

                    case 4:
                        System.out.print("Introdueix l'escuderia (ex: Ferrari, Mercedes): ");
                        String escuderia = entrada.nextLine();
                        novaNoticia = new NoticiaF1(titular, escuderia);
                        break;

                    case 5:
                        System.out.print("Introdueix l'equip (ex: Honda, Yamaha): ");
                        String equip = entrada.nextLine();
                        novaNoticia = new NoticiaMotociclisme(titular, equip);
                        break;

                    default:
                        System.out.println("Tipus d'esport no reconegut.");
                        return;
                }
                redactor.afegirNoticia(novaNoticia);
                System.out.println("Notícia creada i assignada al redactor correctament!");
        }

        }



    private static void eliminarNoticia() {
        //(cal demanar el redactor i el titular de la notícia)

        ArrayList<Noticia> noticiaEliminar = null;
        System.out.println("Introdueix el DNI del redactor al que  vol eliminar una noticia: ");
        String dni = entrada.nextLine();
        Redactor redactorEliminar = buscarRedactorPerDni(dni);

        if (redactorEliminar == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
        } else {
            noticiaEliminar = redactorEliminar.getNoticies();

            System.out.println("Introdueix el titular de la noticia  que vol eliminar: ");
            String titular = entrada.nextLine();
            for(Noticia n: noticiaEliminar) {
                if (n.getTitular().equalsIgnoreCase(titular)) {
                    noticiaEliminar.remove(n);
                    System.out.println("Noticia eliminada correctament.");
                    return;
                }
            }
            System.out.println("Error: No existeix una noticia amb aquest titular.");

        }



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

