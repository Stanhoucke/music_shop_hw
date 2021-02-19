package instruments.guitars;

import instruments.Instrument;
import instruments.InstrumentType;

public class Guitar extends Instrument {
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
}
