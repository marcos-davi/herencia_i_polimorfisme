package nivel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Redactor> redactors = new ArrayList<Redactor>();
    private static Scanner enter = new Scanner(System.in);

    public static void main(String[] args) {

        showMenu();
    }

    private static void showMenu() {
        int option;
        boolean getOut = false;
        do {
            System.out.println("----------Introdueix el una opció del menu: ----------");
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

            if (enter.hasNextInt()) {
                option = enter.nextInt();
                enter.nextLine();
            } else {
                System.out.println("Si us plau, introdueix un número vàlid.");
                enter.nextLine();
                continue;
            }
            switch (option) {
                case 1:
                    addRedactor();
                    break;
                case 2:
                    deleteRedactor();
                    break;
                case 3:
                    addNewsToRedactor();
                    break;
                case 4:
                    deleteNews();
                    break;
                case 5:
                    showRedactorNews();
                    break;
                case 6:
                    calculateNewsPuntuaction();
                    break;
                case 7:
                    calculateNewsPrice();
                    break;
                case 0:
                    System.out.println("Gràcies per utilitzar l'aplicació. Fins aviat!");
                    getOut = true;
                    break;
            }
        }while (!getOut);
    }

    private static void addRedactor() {

        System.out.println("Introdueix el nom del redactor: ");
        String name = enter.nextLine();
        System.out.println("Introdueix el DNI del redactor: ");
        String id = enter.nextLine();

        if (findRedactorById(id) != null) {
            System.out.println("Error: Ja existeix un redactor amb aquest DNI.");
        } else {
            Redactor redactor = new Redactor(name, id);
            redactors.add(redactor);
            System.out.println("Redactor afegit correctament.");
        }

    }

    private static void deleteRedactor() {
        System.out.println("Introdueix el DNI del redactor que vol eliminar: ");
        String dni = enter.nextLine();
        Redactor redactor = findRedactorById(dni);

        if (findRedactorById(dni) == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
        } else {

            redactors.remove(redactor);
            System.out.println("Redactor eliminat correctament.");
        }

    }

    private static void addNewsToRedactor() {
        System.out.println("Introdueix el DNI del redactor que al vol introduir una noticia: ");
        String id = enter.nextLine();
        Redactor redactor = findRedactorById(id);
        News newNews = null;

        if (findRedactorById(id) == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
        } else {
            boolean sortir = false;
            int sportType = 0;

                System.out.println("\nRedactor: " + redactor.getName() +" " + redactor.getId());

                System.out.println("\nSelecciona el tipus de notícia:");
                System.out.println("1. Futbol");
                System.out.println("2. Bàsquet");
                System.out.println("3. Tenis");
                System.out.println("4. Fórmula 1");
                System.out.println("5. Motociclisme");
                System.out.print("Opció d'esport: ");


                if (enter.hasNextInt()) {
                    sportType = enter.nextInt();
                    enter.nextLine();
                } else {
                    System.out.println("Si us plau, introdueix un número vàlid.");
                    enter.nextLine();
                }
                System.out.println("Introdueix un titular");
                String title = enter.nextLine();


                switch (sportType) {
                    case 1:
                        System.out.println("Introdueix una competicio (ex: Lliga de Campions o Lliga): ");
                        String soccerCompet = enter.nextLine();
                        System.out.println("Introdueix un clubFutebol (ex: Barça, Madrid): ");
                        String soccerClub = enter.nextLine();
                        System.out.println("Introdueix un futiboliste (ex: Ferran Torres o Benzema): ");
                        String soccerPlayer = enter.nextLine();
                        newNews = new SoccerNews(title, soccerCompet, soccerClub, soccerPlayer);
                        break;

                    case 2:
                        System.out.print("Introdueix la competició (ex: Eurolliga, ACB): ");
                        String basketNews = enter.nextLine();
                        System.out.print("Introdueix el club (ex: Barça, Madrid): ");
                        String basketClub = enter.nextLine();
                        newNews = new BasketballNews(title, basketNews, basketClub);
                        break;

                    case 3:
                        System.out.print("Introdueix la competició: ");
                        String tennisComp = enter.nextLine();
                        System.out.print("Introdueix el tenista principal (ex: Nadal, Federer, Djokovic): ");
                        String tennisPlayer = enter.nextLine();
                        newNews = new TennisNews(title, tennisComp, tennisPlayer);
                        break;

                    case 4:
                        System.out.print("Introdueix l'escuderia (ex: Ferrari, Mercedes): ");
                        String f1Team = enter.nextLine();
                        newNews = new F1News(title, f1Team);
                        break;

                    case 5:
                        System.out.print("Introdueix l'equip (ex: Honda, Yamaha): ");
                        String teamMoto = enter.nextLine();
                        newNews = new MotorcyclingNews(title, teamMoto);
                        break;

                    default:
                        System.out.println("Tipus d'esport no reconegut.");
                        return;
                }
                redactor.addNews(newNews);
                System.out.println("Notícia creada i assignada al redactor correctament!");
        }

        }



    private static void deleteNews() {
        List<News> newsDelete = null;
        System.out.println("Introdueix el DNI del redactor al que  vol eliminar una noticia: ");
        String id = enter.nextLine();
        Redactor redactorDelete = findRedactorById(id);

        if (redactorDelete == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
        } else {
            newsDelete = redactorDelete.getNews();

            System.out.println("Introdueix el titular de la noticia  que vol eliminar: ");
            String title = enter.nextLine();
            for(News n: newsDelete) {
                if (n.getTitle().equalsIgnoreCase(title)) {
                    newsDelete.remove(n);
                    System.out.println("Noticia eliminada correctament.");
                    return;
                }
            }
            System.out.println("Error: No existeix una noticia amb aquest titular.");

        }



    }

    private static void showRedactorNews() {
        List<News> mostrarNews = null;
        System.out.println("Introdueix el DNI del redactor al que  vol eliminar una noticia: ");
        String dni = enter.nextLine();
        Redactor redactorNoticias = findRedactorById(dni);
        if (redactorNoticias == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
        }else {
            mostrarNews = redactorNoticias.getNews();
            for (News n : mostrarNews) {
                System.out.println("Titular: " + n.getTitle());
                System.out.println("Puntuació: " + n.getPunctuation());
                System.out.println("Preu: " + n.getPrice());
            }
        }

    }

    private static void calculateNewsPuntuaction() {
        System.out.println("Introdueix el DNI del redactor: ");
        String dni = enter.nextLine();
        Redactor redactor = findRedactorById(dni);

        if (redactor == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
            return;
        }

        System.out.println("Introdueix el titular de la notícia: ");
        String titular = enter.nextLine();

        for (News n : redactor.getNews()) {
            if (n.getTitle().equalsIgnoreCase(titular)) {
                // El polimorfismo ejecuta el cálculo específico del deporte
                int punts = n.calculateNewsPunctuation();
                System.out.println("La puntuació de la notícia és: " + punts + " punts.");
                return;
            }
        }
        System.out.println("Error: No s'ha trobat cap notícia amb aquest titular.");

    }

    private static void calculateNewsPrice() {
        System.out.println("Introdueix el DNI del redactor: ");
        String dni = enter.nextLine();
        Redactor redactor = findRedactorById(dni);

        if (redactor == null) {
            System.out.println("Error: No existeix un redactor amb aquest DNI.");
            return;
        }

        System.out.println("Introdueix el titular de la notícia: ");
        String titular = enter.nextLine();

        for (News n : redactor.getNews()) {
            if (n.getTitle().equalsIgnoreCase(titular)) {
                double preu = n.calculateNewsPrice();
                System.out.println("El preu de la notícia és: " + preu + " €.");
                return;
            }
        }
        System.out.println("Error: No s'ha trobat cap notícia amb aquest titular.");

    }


    private static Redactor findRedactorById(String dni) {
        for (Redactor r : redactors) {
            if (r.getId().equalsIgnoreCase(dni)) {
                return r;
            }
        }
        return null;
    }

}

