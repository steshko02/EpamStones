package characteristic;

public enum SemiPreciousStoneType  {
    Garnet,
    Dioptase,
    Epidote,
    Turquoise,
    LightAmethyst,
    Sunstone,
    GreenTourmaline,
    ClearRockCrystal,
    Chalcedony,
    Moonstone;

    public static SemiPreciousStoneType getElementByIndex(int index) {
        return SemiPreciousStoneType.values()[index];
    }
}
