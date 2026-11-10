package nivel1.exercise2;

public class Main {
    static void main(String[] args) {
        // Cridant el mètode brake() sense crear cap objecte.
        System.out.println("Cridant el mètode brake() sense crear cap objecte.");
        Car.brake();
        System.out.println("----------------------------------------------------------");
        //Creant una instància de Car
        Car car1 = new Car(140);
        Car car2 = new Car(200);

        System.out.println("Cridant el mètode accelerate() des d’instància car1");
        // Cridant el mètode accelerate() des d’instància car1

        Car.model ="CRH";
        car1.accelerate();
        Car.model = "Prius";
        Car.brake();
        car1.accelerate();
        car2.accelerate();




    }
}
