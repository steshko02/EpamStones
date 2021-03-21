package random;

public class Random {
    public static float random(float min, float max){
        return (float) (Math.random() * (max - min) + min);
    }
    public static int random(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }
}
