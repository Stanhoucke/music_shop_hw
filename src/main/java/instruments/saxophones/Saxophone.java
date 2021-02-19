package instruments.saxophones;

import behaviours.IPlay;
import behaviours.ISell;
import instruments.Instrument;
import instruments.InstrumentType;

public class Saxophone extends Instrument implements IPlay, ISell {
    private SaxophoneType saxophoneType;

    public Saxophone(String material, String colour, InstrumentType instrumentType, SaxophoneType saxophoneType, double buyPrice, double sellPrice) {
        super(material, colour, instrumentType, buyPrice, sellPrice);
        this.saxophoneType = saxophoneType;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public void setSaxophoneType(SaxophoneType saxophoneType) {
        this.saxophoneType = saxophoneType;
    }

    public String playSound(){
        return "That sweet saxophone sound";
    }

    public double calculateMarkUp(){
        return this.getSellPrice() - this.getBuyPrice();
    }

}
