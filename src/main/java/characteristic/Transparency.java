package characteristic;

public enum Transparency {
    Transparent ,
    Translucent,
    SemiTranslucent,
    Opaque;

    public static Transparency getElementByIndex(int index) {
        if(index>= Transparency.values().length){
            throw new IllegalArgumentException("the transferred index is not suitable");
        }
        return Transparency.values()[index];
    }
}
