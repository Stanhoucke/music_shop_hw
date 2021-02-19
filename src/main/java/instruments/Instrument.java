package instruments;

public abstract class Instrument {
    private String material;
    private String colour;
    private InstrumentType instrumentType;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String material, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    // Getters and setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
