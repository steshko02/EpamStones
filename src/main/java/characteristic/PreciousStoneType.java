package characteristic;

public enum PreciousStoneType {
    Diamond,
    Emerald,
    Ruby,
    Sapphire,
    Pearls;

    public static PreciousStoneType getElementByIndex(int index) {
        if(index>= PreciousStoneType.values().length){
            throw new IllegalArgumentException("the transferred index is not suitable");
        }
        return PreciousStoneType.values()[index];
    }
}
