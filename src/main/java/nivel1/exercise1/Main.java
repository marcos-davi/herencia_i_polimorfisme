package nivel1.exercise1;

public class Main {
    static void main(String[] args) {
        //Create  objects from each subclasses
        Instrument timbales = new PercussionInstrument("timabales", 500);
        Instrument viola = new StringInstrument("Violin", 700);
        Instrument saxophone = new WindInstrument("Saxophone", 1500);

        //call the methods play() of the created objects .
        timbales.play();
        saxophone.play();
        viola.play();
    }
}
