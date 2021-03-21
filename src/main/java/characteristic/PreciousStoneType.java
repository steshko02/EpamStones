package characteristic;

public enum PreciousStoneType {
    Diamond,
    Emerald,
    Ruby,
    Sapphire,
    Pearls;

    public static PreciousStoneType getElementByIndex(int index) {
        return PreciousStoneType.values()[index];
    }
}
