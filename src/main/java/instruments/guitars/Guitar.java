package instruments.guitars;

import behaviours.IPlay;
import behaviours.ISell;
import instruments.Instrument;
import instruments.InstrumentType;

public class Guitar extends Instrument implements IPlay, ISell {
    private GuitarType guitarType;

    public Guitar(String material, String colour, InstrumentType instrumentType, GuitarType guitarType, double buyPrice, double sellPrice) {
        super(material, colour, instrumentType, buyPrice, sellPrice);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return this.getGuitarType().getNumberOfStrings();
    }

    public String playSound() {
        return "That sweet guitar sound";
    }

    public double calculateMarkUp() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
