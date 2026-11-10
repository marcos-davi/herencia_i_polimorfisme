package nivel1.exercise1;

public class StringInstrument extends Instrument {


    public StringInstrument(String name, int price) {
        super(name, price);
    }

    // methode play implemented
    @Override
    public void play() {
        System.out.println("Està sonant un " + super.getName());

    }
}
