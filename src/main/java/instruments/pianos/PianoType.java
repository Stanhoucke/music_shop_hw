package instruments.pianos;

public enum PianoType {

    GRAND(88),
    KEYBOARD(49);

    private final int numberOfKeys;

    PianoType(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
