package instruments.pianos;

import behaviours.IPlay;
import behaviours.ISell;
import instruments.Instrument;
import instruments.InstrumentType;

public class Piano extends Instrument implements IPlay, ISell {
    private PianoType pianoType;

    public Piano(String material, String colour, InstrumentType instrumentType, PianoType pianoType, double buyPrice, double sellPrice) {
        super(material, colour, instrumentType, buyPrice, sellPrice);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public void setPianoType(PianoType pianoType) {
        this.pianoType = pianoType;
    }

    public int getNumberOfKeys(){
        return this.getPianoType().getNumberOfKeys();
    }

    public String playSound(){
        return "That sweet piano sound";
    }

    public double calculateMarkUp(){
        return this.getSellPrice() - this.getBuyPrice();
    }
}
