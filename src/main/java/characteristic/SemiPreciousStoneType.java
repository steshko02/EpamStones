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
        if(index>= SemiPreciousStoneType.values().length){
            throw new IllegalArgumentException("the transferred index is not suitable");
        }
        return SemiPreciousStoneType.values()[index];
    }
}
