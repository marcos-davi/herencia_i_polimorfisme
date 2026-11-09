package nivel3;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String name;
    private final String id;
    private static int salary = 1500;
    private ArrayList<News> newsList;


    // constructor
    public Redactor(String name, String id) {
        this.name = name;
        this.id = id;
        this.newsList = new ArrayList<>();
    }

    // Getters and Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public static int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        Redactor.salary = salary;
    }

    public List<News> getNews() {
        return newsList;
    }
    public void addNews(News news) {
        this.newsList.add(news);
    }
}
