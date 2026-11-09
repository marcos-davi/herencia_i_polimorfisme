package nivel1.exercise1;

public class Main {
    static void main(String[] args) {
        //Create  objects from each subclasses
        Instrument timbales = new PercussionInstrument();
        Instrument viola = new StringInstrument();
        Instrument saxophone = new WindInstrument();

        //call the methods play() of the created objects .
        timbales.play();
        saxophone.play();
        viola.play();
    }
}
