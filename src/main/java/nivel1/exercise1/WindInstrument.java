package nivel1.exercise1;

public class WindInstrument extends Instrument {


    public WindInstrument(String name, int price) {
        super(name, price);
    }

    // methode play implemented
    @Override
    public void play() {
        System.out.println("Està sonant un " + super.getName());

    }
}
