package nivel2;

public class Phone {
    String marca;
    String model;

    public Phone(String model, String marca) {
        this.model = model;
        this.marca = marca;
    }

    public void call(int number){
        System.out.println("It's calling to: " + number);
    }
}
