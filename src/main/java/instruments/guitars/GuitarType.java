package instruments.guitars;

public enum GuitarType {
    ACOUSTIC(6),
    ELECTRIC(6),
    BASS(4);

    private final int numberOfStrings;

    GuitarType(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
