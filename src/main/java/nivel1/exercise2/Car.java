package nivel1.exercise2;

public class Car {
    final static String brand = "Toyota";
    static String model;
    final int power;

    public Car(int power) {
        this.power = power;
    }


    //mètode estàtic brake()
    static void brake() {
        System.out.println("El vehicle " +brand +" " + model+ " està frenant");
    }

    //mètode no estàtic accelerate()
    public void accelerate() {
        System.out.println("El vehicle " +brand +" " + model+ " està accelerant");
    }

}
