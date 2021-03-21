package characteristic;


public enum Color  {
    Green,
    Blue,
    Purple,
    Red,
    Yellow,
    White;

    public static Color getElementByIndex(int index) {
        return Color.values()[index];
    }
}


