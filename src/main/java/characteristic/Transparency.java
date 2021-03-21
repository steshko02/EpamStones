package characteristic;

public enum Transparency {
    Transparent ,
    Translucent,
    SemiTranslucent,
    Opaque;

    public static Transparency getElementByIndex(int index) {
        return Transparency.values()[index];
    }
}
