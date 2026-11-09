package nivel2;

public class Main {
    static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("z11", "Motorola");
        smartphone1.call(666555444);
        Camera camera1 = smartphone1;
        camera1.takePicture();
        Clock clock1 = smartphone1;
        smartphone1.alarmSounds();

    }
}
