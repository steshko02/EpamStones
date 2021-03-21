package characteristic;


public enum Color  {
    Green,
    Blue,
    Purple,
    Red,
    Yellow,
    White;

    public static Color getElementByIndex(int index) {
        if(index>= Color.values().length){
            throw new IllegalArgumentException("the transferred index is not suitable");
        }
        return Color.values()[index];
    }
}


